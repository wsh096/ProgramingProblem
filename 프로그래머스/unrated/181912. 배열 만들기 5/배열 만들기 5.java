//1. 단순 풀이(마지막 정답 부분도 스트림 안 쓰는게 성능 상은 더 좋음)

// import java.util.List;
// import java.util.LinkedList;
// class Solution {
//     public int[] solution(String[] intStrs, int k, int s, int l) {
//         List<Integer> answer = new LinkedList<>();
//         for(int i = 0 ; i < intStrs.length; i++){
//             int target = Integer.parseInt(intStrs[i].substring(s,s+l));
//             if(target > k) answer.add(target);        
//         }
//         return answer.stream().mapToInt(Integer::intValue).toArray();
//     }
// }

//2. 스트림을 활용한 풀이.
import java.util.Arrays;

class Solution{
    public int[] solution(String [] intStrs, int k, int s, int l){
        return Arrays.stream(intStrs).mapToInt(str -> Integer.parseInt(str.substring(s,s+l))).filter(num-> num > k).toArray();
}
}