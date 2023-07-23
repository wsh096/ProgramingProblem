class Solution {
    int[] dx = {0, 1 , 0 , -1};
    int[] dy = {1, 0, -1, 0};
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0, y = 0, direction = 0, num = 1;
        while(num <= n*n){
            answer[x][y] = num++;
            int nx = x+dx[direction];
            int ny = y+dy[direction];
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0){
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}