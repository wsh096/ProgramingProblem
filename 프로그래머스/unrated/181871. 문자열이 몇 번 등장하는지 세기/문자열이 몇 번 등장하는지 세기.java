//1. 일반 풀이
// class Solution {
//     public int solution(String myString, String pat) {
//          int answer = 0;
//         for(int i = 0; i <= myString.length()-pat.length();i++){
//             if(myString.substring(i,i+pat.length()).equals(pat)) answer++;
//         }
//         return answer;
//     }
// }

//2. 스트림 풀이
import java.util.stream.IntStream;
class Solution {
    public int solution(String myString, String pat) {
        return (int) IntStream.rangeClosed(0, myString.length()-pat.length()).filter(i->myString.substring(i,i+pat.length()).equals(pat)).count();//카운트는 default가 long
    }
}