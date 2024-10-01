import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    static int N, M;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        visited = new boolean[N][M];
        
        for(int i = 0; i < N; i++){
            char[] temp = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++){
                if(temp[j] == '0'){
                    visited[i][j] = true;
                }else{
                    visited[i][j] = false;
                }
            }
        }
    //위치 정보와 현재 이동값.
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {0, 0, 1});
    visited[0][0] = true;
    while(!queue.isEmpty()){
        int[] temp = queue.poll();
        if(temp[0] == (N - 1) && temp[1] == (M -1)){
            System.out.println(temp[2]);
            break;
        }
        for(int i = 0; i < 4; i++){
            int nx = temp[0] + dx[i];
            int ny = temp[1] + dy[i];
            if(nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny] == true){
                continue;
            }else{
                queue.offer(new int[] {nx, ny, temp[2] + 1});
                visited[nx][ny] = true;
            }
        }
    }
}
}