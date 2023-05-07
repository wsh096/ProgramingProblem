//1. 일반 풀이
// import java.util.*;
// class Solution {
//     public String[] solution(String[] strArr) {
//         List<String> list = new ArrayList<>();
//         for(String str : strArr) {
//             if(str.contains("ad")) continue;
//             list.add(str);
//         }
//         if(strArr.length == list.size()) return strArr; //최적화
//         String [] answer = new String[list.size()];
        
//         for(int i = 0; i < list.size(); i++){
//             answer[i] = list.get(i);
//         }
//         return answer;
//     }
// }

//2. 스트림 풀이
import java.util.stream.IntStream;
class Solution {
    public String[] solution(String[] strArr) {
              return IntStream.range(0,strArr.length).filter(i->!strArr[i].contains("ad")).mapToObj(i->strArr[i]).toArray(String[]::new);
    }
}