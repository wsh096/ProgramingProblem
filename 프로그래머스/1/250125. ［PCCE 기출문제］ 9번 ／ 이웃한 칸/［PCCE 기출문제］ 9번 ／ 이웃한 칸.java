class Solution {
    //위//오//아//왼
  
    public int solution(String[][] board, int h, int w) {
        //String target = board[h][w];
          int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
        int answer = 0;
        if(board.length == 1) return answer;
        for(int i = 0; i < 4; i++)
        {
            int h_check = h + dx[i];
            int w_check = w + dy[i];
            if(h_check < 0 || h_check >= board[0].length || w_check < 0 || w_check >= board.length) continue;

            if(board[h_check][w_check].equals(board[h][w])){
                answer++;
            }   
        }
        return answer;
    }
}