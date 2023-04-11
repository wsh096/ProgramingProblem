// import java.util.Queue;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.TreeMap;
// import java.util.Comparator;
// class Solution {
//     int MAX_PICK;
//     public int solution(int[] picks, String[] minerals) {
//         int sum = picks[0] + picks[1] + picks[2];
//          MAX_PICK = Math.min(sum,(minerals.length+4)/5);
//         int[] newPicks = new int[3];
// Map<Integer, Queue<Character>> map = new HashMap<>();
//    int temp = MAX_PICK;
//         int pickIdx = 0;
//         while(temp > 0){
//           while(picks[pickIdx]==0)pickIdx++;
//             picks[pickIdx]--;
//             newPicks[pickIdx]++;
//             temp--;
//         }
        
//         int mineralIdx = 0;
//         while(temp < MAX_PICK){
//            Queue<Character> queue = new LinkedList<>();
//         while(mineralIdx < minerals.length && queue.size() < 5)
//             queue.add(minerals[mineralIdx++].charAt(0));
//             map.put(temp++, queue);
//         }
//     return min(newPicks, map, temp);
//     }
//     private int min(int[] picks, Map<Integer,Queue<Character>> slice, int max){
//         int answer = 0;
//         Map<Integer, LinkedList<Integer>> map = new TreeMap<>(Comparator.reverseOrder()); //가장 큰 값, slice에 접근할 수 있는 i를 value로 가지는 트리맵 내림차순//값이 겹칠 수도 있음...!
//       for(int i : slice.keySet()){
//          int sum = 0;
//           Queue<Character> queue = slice.get(i);
//         int size = queue.size();
//           while(size > 0){
//           char c = queue.poll();
//           if(c == 'd') sum+= 25;
//          else if(c == 'i')sum +=5;
//           else sum+=1;
//               queue.offer(c);
//               size--;
//           }
//           if(map.containsKey(sum)) map.get(sum).add(i);
//           else{
//               LinkedList<Integer> list = new LinkedList<>();
//               list.add(i);
//     map.put(sum,list);
//     }//키가 되는 피로도 여러개일 가능성
//           }
//     int idx = 0;
//     for(LinkedList<Integer> temp : map.values()){
//         for(int key : temp){
//  Queue<Character> queue = slice.get(key);
//             int size = queue.size();
//     while(!queue.isEmpty()){
//     while(picks[idx] == 0)idx++;
//         char c = queue.poll();
//         if(idx == 0) answer+=1;
//         else if(idx==1) {
//             if(c=='d') answer+=5;
//             else answer += 1;
//         }else{
//           if(c=='d') answer+=25;
//     else if(c=='i') answer += 5; 
//           else answer += 1;
//         }
//         }
//         picks[idx]--;
//     }
//     }  
//     return answer;
//     }
// }

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        return IntStream.iterate(0, i -> i < Math.min(minerals.length, Arrays.stream(picks).sum() * 5),  i -> i + 5)
            .mapToObj(i -> Arrays.stream(Arrays.copyOfRange(minerals, i, Math.min(i + 5, minerals.length)))
                    .mapToInt(s -> s.charAt(0) == 'd' ? 25 : s.charAt(0) == 'i' ? 5 : 1).toArray())
            .sorted((a, b) -> Arrays.stream(b).sum() - Arrays.stream(a).sum())
            .mapToInt(arr -> {
                int n = picks[0]-- > 0 ? 25 : picks[1]-- > 0 ? 5 : 1;
                return Arrays.stream(arr).map(i -> Math.max(i / n, 1)).sum();})
            .sum();
    }
}