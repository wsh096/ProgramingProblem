//1. 일반풀이
// class Solution {
//     public String solution(String n_str) {
//         if(n_str.startsWith("0")){
//         int idx = 1; 
//             while(n_str.charAt(idx) == '0') idx++;
//         return n_str.substring(idx);
//         }
//         return n_str;
//     }
// }

//2. 스트림풀이
// import java.util.stream.Collectors;
// class Solution {
//     public String solution(String n_str) {
//         return n_str.chars().dropWhile(chAscII->chAscII == 48).mapToObj(chAscII ->String.valueOf(chAscII - '0')).collect(Collectors.joining());
//     }
// }

//3. 좋은 풀이(0을 제거하는 거구나!)
class Solution {
    public String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }
}