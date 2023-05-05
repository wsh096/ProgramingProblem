//1. 일반 풀이
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list){
            while(num != 1){
             num = num % 2 == 0 ? num / 2 : (num-1)/2;
              answer++;
            }
        }
        return answer;
    }
}

//2. 스트림 풀이 //굳이
// import java.util.Arrays;
// class Solution {
//     public int solution(int[] num_list) {
//         return Arrays.stream(num_list).map(num -> {
//             int cnt = 0; 
//             while(num != 1) {
//                 num = num % 2 == 0 ? num / 2 : (num-1)/2;
//                 cnt++;
//             }
//             return cnt;
//         }).sum();
//     }
// }