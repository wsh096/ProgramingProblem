//1. Map을 활용한 기본 풀이
// import java.util.Map;
// import java.util.HashMap;
// import java.util.Set;
// class Solution {
//     public int solution(String[] strArr) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(String s : strArr){
//             int i = s.length();
//             map.put(i, map.getOrDefault(i, 0) + 1);
//         }
//         int answer = 0;
//         for(int i : ){
//             answer = i > answer ? i : answer;
//         }
//         return answer;
//     }
// }

// 배열만을 활요한 풀이
import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int [] sLen = new int[31];
        for(int i = 0; i < strArr.length; i++){
            sLen[strArr[i].length()]++;
        }
        return Arrays.stream(sLen).max().getAsInt();
    }
}