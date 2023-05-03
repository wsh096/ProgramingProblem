//1. 일반 풀이

// class Solution {
//     public String solution(String my_string, int[] indices) {
       
//         char[] ch = my_string.toCharArray();
//         StringBuilder sb = new StringBuilder();
        
//         for(int i : indices)
//             ch[i]='-';
        
//         for(char c : ch)
//             if(c!='-') 
//                 sb.append(c);
        
//         return sb.toString();
//     }
// }

//2. 스트림 풀이
import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Solution{
    public String solution(String my_string, int[] indices) {
     return IntStream.range(0, my_string.length()).mapToObj(i->(IntStream.of(indices).anyMatch(x-> x == i) ? "-" : my_string.charAt(i))).map(String::valueOf).collect(Collectors.joining()).replaceAll("-","");
    }
}