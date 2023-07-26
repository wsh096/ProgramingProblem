// class Solution {
//     public String solution(String[] my_strings, int[][] parts) {
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < my_strings.length;i++){
//             int[] ints = parts[i];
//             String str = my_strings[i];
//             sb.append(str.substring(ints[0],ints[1]+1));
//         }
//         return sb.toString();
//     }
// }
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;

// class Solution {
//     public String solution(String[] my_strings, int[][] parts) {
//         return IntStream.range(0, my_strings.length)
//                 .mapToObj(i -> {
//                     int[] ints = parts[i];
//                     String str = my_strings[i];
//                     return str.substring(ints[0], ints[1] + 1);
//                 })
//                 .collect(Collectors.joining());
//     }
// }


class Solution{
    public String solution(String[] my_strings, int[][] parts){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < parts.length; i++){
            int start = parts[i][0];
            int end = parts[i][1] + 1;
            sb.append(my_strings[i].substring(start, end));
        }
        return sb.toString();
    }
}