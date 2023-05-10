//1. 일반 풀이
// class Solution {
//     public int solution(int[][] board, int k) {
//         int answer = 0;
//         for(int i = 0; i <= Math.min(board.length-1,k); i++){
//             for(int j = 0; j <= Math.min(board[i].length-1,k); j++){
//               if(i+j<=k) answer += board[i][j]; 
//             }
//         }
//         return answer;
//     }
// }

//2. 스트림 풀이
import java.util.stream.IntStream;
class Solution {
    public int solution(int[][] board, int k) {
        return IntStream.range(0, board.length).flatMap(i -> IntStream.range(0, board[i].length).filter(j -> i+j <= k).map(j -> board[i][j])).sum();
}
}