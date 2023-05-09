// //1.일반 풀이

// class Solution {
//     public int solution(int[][] arr) {
//         for(int i = 0; i < arr.length; i++)
//             for(int j = 0; j < arr.length; j++)
//                 if(arr[i][j]!=arr[j][i]) return 0;
//         return 1;
//     }
// }

// //2.스트림 풀이
import java.util.stream.IntStream;
class Solution {
    public int solution(int[][] arr) {
        return IntStream.range(0, arr.length).allMatch(i -> IntStream.range(0,arr[0].length).map(j->arr[i][j]-arr[j][i]).allMatch(k -> k == 0)) ? 1: 0;
    }
}