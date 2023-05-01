//1. 일반 풀이

// class Solution {
//     public String solution(int q, int r, String code) {
//         char[] cd = code.toCharArray();
//        StringBuilder answer = new StringBuilder();
//         for(int i = r; i < cd.length; i += q){
//             answer.append(cd[i]);
//         }
//         return answer.toString();
//     }
// }

//2. 스트림 풀이

import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Solution {
    public String solution(int q, int r, String code) {
 return IntStream.range(0,code.length()).filter(i-> i % q == r).mapToObj(i -> String.valueOf(code.charAt(i))).collect(Collectors.joining());
    }
}