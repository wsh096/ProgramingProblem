class Solution {
    int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
    int[] dy = {-1, 1, 0, 0, -1, 1, -1, 1};//좌우상하, 상좌, 상우, 하좌, 하우
    public int solution(int[][] board) {
        int n = board.length;
        int answer = n*n;
        boolean[][] isDanger = new boolean[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    if(!isDanger[i][j])answer--;
                    isDanger[i][j] = true;
                    for(int k = 0; k < 8; k++){
                       int nx = i + dx[k], ny = j + dy[k];
                        if(nx < 0 || nx >= n|| ny < 0|| ny >= n|| isDanger[nx][ny]) continue;
                        isDanger[nx][ny] = true;
                        answer--;
                    }
                }
            }
        }
        
        return answer;
    }
}