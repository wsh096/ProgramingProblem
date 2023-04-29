
//일반 풀이.
// import java.util.Arrays;
// class Solution {
//     public String[] solution(String my_string) {
//         String[] answer = new String[my_string.length()];
//         int i = 0;
//         while(i < my_string.length()){
//             answer[i] = my_string.substring(i); 
//             i++;         
//         }
//         Arrays.sort(answer);
//         return answer;
//     }
// }

//스트림 풀이
import java.util.stream.IntStream;
class Solution{
    public String[] solution(String my_string){
        return IntStream.range(0,my_string.length()).mapToObj(i-> my_string.substring(i)).sorted().toArray(String[]::new);
    }
}