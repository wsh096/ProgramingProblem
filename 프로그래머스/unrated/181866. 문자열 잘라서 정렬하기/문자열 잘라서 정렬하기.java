//1. 일반 풀이
import java.util.*;
// class Solution {
//     public String[] solution(String myString) {
//         String[] s = myString.split("x"); Arrays.sort(s);
//         List<String> answer = new LinkedList<>(); for(String str : s) if(!str.equals("")) answer.add(str); return answer.stream().toArray(String[]::new);
//     }
// }

//2. 스트림 풀이
class Solution {
    public String[] solution(String myString){
        return Arrays.stream(myString.split("x")).sorted().filter(s->!s.equals("")).toArray(String[]::new);
    }
}