import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r, c, d, res;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static void dfs(int x, int y, int dir) {
        if (!visited[x][y]) {
            visited[x][y] = true;
            res++;
        }

        for (int i = 0; i < 4; i++) {
            dir = (dir + 3) % 4;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (map[nx][ny] == 0 && !visited[nx][ny]) {
                dfs(nx, ny, dir);
                return;
            }
        }

        int nd = (dir + 2) % 4;
        int nx = x + dx[nd];
        int ny = y + dy[nd];
        if (map[nx][ny] == 1) {
            return;
        }
        dfs(nx, ny, dir);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(r, c, d);
        System.out.println(res);
    }
}