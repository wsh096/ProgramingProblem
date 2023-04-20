import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        Queue<int[]> bfs = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        bfs.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!bfs.isEmpty()){
            int[] cur = bfs.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];
            if(x == n - 1 && y == m - 1){
                return cnt;
            }
            for(int  i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m || maps[nx][ny] == 0 || visited[nx][ny])
                    continue;//가지 말란 뜻
                visited[nx][ny] = true;
                bfs.add(new int[] {nx, ny , cnt + 1});//최소값만 담김.
            }
        }
        return -1;//여기까지 오는 건 -1
    }
}