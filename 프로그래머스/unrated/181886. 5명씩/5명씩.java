//1. 일반 풀이.
// class Solution {
//     public String[] solution(String[] names) {
//         String[] answer = new String[(names.length+4)/5];//올림하는 방법입니다.
//         int idx = 0;
//         for(int i = 0; i < names.length; i += 5) answer[idx++] = names[i];
//         return answer;
//     }
// }

//2.스트림 풀이
import java.util.stream.IntStream;
class Solution {
    public String[] solution(String[] names) {
        return IntStream.range(0,names.length).filter(i->i%5==0).mapToObj(i->names[i]).toArray(String[] :: new);
    }
}