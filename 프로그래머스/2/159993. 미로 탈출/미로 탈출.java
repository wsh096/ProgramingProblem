import java.util.Queue;
import java.util.LinkedList;

class Solution {
    char[][] board;
    int n,m;
    int[] dx = {-1, 0, 1 , 0};
    int[] dy = {0, 1, 0, -1};
    int[] start, toggle;
    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        board = new char[n][m];
        
        for(int i = 0; i < n; i++){
            char[] map = maps[i].toCharArray();
            for(int j = 0; j < m; j++){
                board[i][j] = map[j];
                if(board[i][j] == 'S') start = new int[]{i, j};
                if(board[i][j] == 'L') toggle = new int[]{i, j};
            }
        }
        
        int possible1 = bfs(start, 'L');
        int possible2 = bfs(toggle, 'E');
        
        if(possible1 == -1 || possible2 == -1) return -1;
        
        return possible1 + possible2;
    }
    private int bfs(int[] start, char goal){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 0});
        
        boolean[][] visited = new boolean[n][m];
        
        while(!queue.isEmpty()){
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int cnt = queue.peek()[2];
            
            visited[x][y] = true; // 방문처리
            
            if(board[x][y] == goal) return cnt;
            
            queue.poll();
            
             for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
            
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || board[nx][ny] == 'X') continue;
        
                queue.offer(new int[]{nx, ny, cnt + 1});
                visited[nx][ny] = true;
                }
        }
        return -1;
    }
}