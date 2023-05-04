import java.util.*;
import java.io.*;
public class Main{
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] town = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split("");
            for(int j = 0; j < N; j++){
                town[i][j] = Integer.parseInt(input[j]);
            }
        }
        List<Integer> answer = new LinkedList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(town[i][j]==1 && visited[i][j]==false){
                    int cnt = 1;
                    Queue<int[]> queue = new LinkedList<>();           
                    visited[i][j] = true;
                    queue.offer(new int[] {i,j});
                    while(!queue.isEmpty()){
                        int[] cur = queue.poll();    
                        int x = cur[0];
                        int y = cur[1];
                        for(int a = 0; a < 4; a++){
                            int nx = x + dx[a];
                            int ny = y + dy[a];
                            if(nx < 0 || nx >= N || ny < 0|| ny >= N || visited[nx][ny] == true || town[nx][ny] == 0) continue;
                            visited[nx][ny] = true;
                            cnt++;
                            queue.offer(new int[] {nx,ny});
                        }
                    }
                    answer.add(cnt);
                }
            }
        }
        
        Collections.sort(answer);
        System.out.println(answer.size());
        for(int i : answer)
        System.out.println(i);
        br.close();
    }
}