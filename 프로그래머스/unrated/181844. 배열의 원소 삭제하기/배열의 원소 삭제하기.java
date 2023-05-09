// //1. 일반 풀이
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Set;
// import java.util.HashSet;
// class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {
//         Set<Integer> delete = new HashSet<>();//그냥 의미적으로 사용.
//         List<Integer> list = new ArrayList<>();
        
//         for(int d : delete_list) delete.add(d);
        
//         for(int i = 0; i < arr.length; i++) {
//             if(delete.contains(arr[i])) continue;
//                 list.add(arr[i]);
//         }
        
//         if(list.size()==arr.length) 
//             return arr;
        
//         int[] answer = new int [list.size()]; 
        
//         for(int i = 0; i < answer.length; i++) 
//             answer[i] = list.get(i);
        
//         return answer;
//     }
// }

// //2. 스트림 풀이 
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).filter(i -> Arrays.stream(delete_list).noneMatch(j -> j == i)).toArray();
    }
}