import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    static int N, M, R;
    static int[][] map;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String[] input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);
            R = Integer.parseInt(input[2]);
            map = new int[N][M];
            visited = new boolean[N][M];
            for(int i = 0; i < R; i++){
                String[] pos = br.readLine().split(" ");
                int x = Integer.parseInt(pos[0]);
                int y = Integer.parseInt(pos[1]);
                map[x][y] = 1;
            }
            sb.append(bfs(map)+"\n");
        }
        System.out.println(sb);
    }
    private static int bfs(int[][] map){
        Queue<int[]> queue = new LinkedList<>();
        int answer = 0; 
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(map[i][j] == 1 && visited[i][j] == false){
                    visited[i][j] = true;
                    answer++;
                    queue.offer(new int[] {i,j});
                    while(!queue.isEmpty()){
                        int[] ints = queue.poll();
                        for(int k = 0; k < 4; k++){
                            int nx = ints[0] + dx[k];
                            int ny = ints[1] + dy[k];
                            if(nx < 0 || nx >= N || ny < 0|| ny >= M || map[nx][ny] == 0 ||visited[nx][ny]) continue;
                            visited[nx][ny] = true;
                            queue.offer(new int[] {nx, ny});
                        }
                    }
                }
            }
        }
        return answer;
    }
}