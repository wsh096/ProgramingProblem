import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        maze = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int j = 0; j < M; j++) {
                maze[i][j] = input.charAt(j) - '0';
            }
        }
        sc.close();
        
        bfs(0, 0);
        System.out.println(maze[N-1][M-1]);
    }
    
    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                
                if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                    maze[nx][ny] = maze[curX][curY] + 1;
                }
            }
        }
    }
}