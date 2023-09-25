import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    static class Loc{
        int i, j, cnt;
        boolean destroyed;
        public Loc(int i, int j, int cnt, boolean d){
            this.i = i;
            this.j = j;
            this.cnt = cnt;
            this.destroyed = d;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        
        char[][] map = new char[n][m];
        for(int i = 0; i < n; i++){
            String input = br.readLine();
            map[i] = input.toCharArray();
        }
        
        Queue<Loc> q = new LinkedList<>();
        q.add(new Loc(0, 0, 1, false));
        
        int[] mi = {0, 0, -1, 1};
        int[] mj = {-1, 1, 0, 0};
        
        boolean[][][] visited = new boolean[n][m][2];
        
        while(!q.isEmpty()){
           Loc now = q.poll();
            
            if(now.i == n - 1 && now.j == m - 1){
                System.out.println(now.cnt);
                return;
            }
            for(int dir = 0; dir < 4; dir++){
                int ni = now.i + mi[dir];
                int nj = now.j + mj[dir];
                
                if(ni < 0 || ni >= n || nj < 0 || nj >= m) continue;
                
                int nextCnt = now.cnt + 1;
                boolean nextDestroyed = now.destroyed;
                
                if(map[ni][nj] == '0'){
                    if(!now.destroyed && !visited[ni][nj][0]){
                        q.offer(new Loc(ni, nj, nextCnt, false));
                        visited[ni][nj][0] = true;
                    }else if(now.destroyed && !visited[ni][nj][1]){
                        q.offer(new Loc(ni, nj, nextCnt, true));
                        visited[ni][nj][1] = true;
                    }
                }else if(map[ni][nj] == '1'){
                    if(!now.destroyed) {
                        q.offer(new Loc(ni, nj, nextCnt, true));
                        visited[ni][nj][1] = true;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}