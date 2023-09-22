import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 301;
    static int T, I;
    static int current_x, current_y, target_x, target_y;
    static int[][] arr = new int[MAX][MAX];
    static boolean[][] visited = new boolean[MAX][MAX];
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    static Queue<Pair> q = new ArrayDeque<>();

    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void reset() {
        while (!q.isEmpty()) q.poll();
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                visited[i][j] = false;
                arr[i][j] = 0;
            }
        }
    }

    static void bfs(int x, int y) {
        q.offer(new Pair(x, y));
        visited[x][y] = true;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int a = p.first;
            int b = p.second;
            if (a == target_x && b == target_y) {
                System.out.println(arr[a][b]);
                while (!q.isEmpty()) {
                    q.poll();
                }
                break;
            }
            for (int i = 0; i < 8; i++) {
                int na = a + dx[i];
                int nb = b + dy[i];
                if (0 <= na && 0 <= nb && na < I && nb < I && !visited[na][nb]) {
                    q.offer(new Pair(na, nb));
                    visited[na][nb] = true;
                    arr[na][nb] = arr[a][b] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            I = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            if (st.hasMoreTokens()) {
                current_x = Integer.parseInt(st.nextToken());
                if (st.hasMoreTokens()) {
                    current_y = Integer.parseInt(st.nextToken());
                }
            }
            
            st = new StringTokenizer(br.readLine());
            
            if (st.hasMoreTokens()) {
                target_x = Integer.parseInt(st.nextToken());
                if (st.hasMoreTokens()) {
                    target_y = Integer.parseInt(st.nextToken());
                }
            }

            bfs(current_x, current_y);
            reset();
        }
    }
}
