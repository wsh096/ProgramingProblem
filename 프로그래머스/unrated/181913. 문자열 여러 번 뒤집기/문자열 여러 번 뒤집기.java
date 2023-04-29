//1. 투포인터의 개념처럼. 접근 // 최고성능

// class Solution {
//     public String solution(String my_string, int[][] queries) {
        
//         char[] answer = my_string.toCharArray();
//             for(int[] query : queries){
//                 int start = query[0];
//                 int end = query[1];
                
//               while(start < end){
//                  char s = answer[start];
//                  char e = answer[end];
//                   answer[start] = e;
//                   answer[end] = s;
//                   start++;
//                   end--;
//                 }
//               }
            
//         return new String(answer);
//     }
// }

//2. StringBuilder의 replace와 reverse 활용. 중간 성능

// class Solution {
//     public String solution(String my_string, int[][] queries) {
//         StringBuilder sb = new StringBuilder(my_string);

//         for (int[] query : queries) {
//             sb.replace(query[0], query[1] + 1, new StringBuilder(sb.substring(query[0], query[1] + 1)).reverse().toString());
//         }

//         return sb.toString();
//     }
// }


//3. 스트림을 활용한 작성 비추 가독성도 낮고 결과적으로 2번 아이디어를 활용한 것.

import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[][] queries) {
        return Arrays.stream(queries).reduce(new StringBuilder(my_string), (sb , query)->
                                             sb.replace(query[0] , query[1] + 1 , new StringBuilder(sb.substring(query[0], query[1] + 1)).reverse().toString())
                                             , (sb1,sb2)->sb1).toString();
    }
}