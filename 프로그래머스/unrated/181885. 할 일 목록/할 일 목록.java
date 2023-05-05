// //1. 일반 풀이
// import java.util.List;
// import java.util.LinkedList;
// class Solution {
//     public String[] solution(String[] todo_list, boolean[] finished) {
//         List <String> answer = new LinkedList<>();
        
//         for(int i = 0; i < finished.length; i++) 
//             if(!finished[i]) 
//                 answer.add(todo_list[i]);
        
//         return answer.stream().toArray(String[]::new);
//     }
// }

//2. 스트림 풀이
import java.util.stream.IntStream;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0,todo_list.length).filter(i->!finished[i]).mapToObj(i-> todo_list[i]).toArray(String[]::new);
    }
}