// //1. 기본 풀이

// class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[num_list.length];
//         int idx = 0;
//         for(int i = n; i < num_list.length; i++){
//             answer[idx++] = num_list[i];
//         }
//         for(int i = 0; i < n; i++){
//             answer[idx++] = num_list[i];
//         }
//         return answer;
//     }
// }

//2. 스트림 풀이
// import java.util.stream.IntStream;
// import java.util.Arrays;
// class Solution {
//     public int[] solution(int[] num_list, int n) {         
//           return IntStream.concat(Arrays.stream(Arrays.copyOfRange(num_list,n,num_list.length)),Arrays.stream(Arrays.copyOfRange(num_list,0,n))).toArray();
//     }
// }
class Solution{
    public int[] solution(int[] num_list, int n){
        
        int size = num_list.length;
        int idx = 0;
        int[] answer = new int[size];
        
        while(idx < size){
            answer[idx++] = num_list[n++%size];
        }
        return answer;
    }
}