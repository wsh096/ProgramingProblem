//1.일반 풀이.
// class Solution {
//     public String solution(String myString, String pat) {
//         for(int i = myString.length(); i>=1;i--)
//             if(myString.substring(0,i).endsWith(pat))
//                 return myString.substring(0,i);
            
//         return ""; // 자바는 이게 참 불편하죠. 절대 안 닿지만, 있어야 합니다.
//     }
// }

//2.스트림 풀이.
import java.util.stream.IntStream;
class Solution {
    public String solution(String myString, String pat) {
        return IntStream.range(0, myString.length()).mapToObj(i -> myString.substring(0,myString.length() - i)).filter(s->s.endsWith(pat)).findFirst().orElse("");
    }
}