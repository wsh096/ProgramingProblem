//1. 일반 풀이
// class Solution {
//     public String[] solution(String[] strArr) {
//         String[] answer =new String[strArr.length];
//         for(int i = 0; i < strArr.length; i++){
//             answer[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
//         }
//         return answer;
//     }
// }
//2. 스트림 풀이.
import java.util.stream.IntStream;
class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0,strArr.length).mapToObj(i-> strArr[i] = i%2==0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
    }
}