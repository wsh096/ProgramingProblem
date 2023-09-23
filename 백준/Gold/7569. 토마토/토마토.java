import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] graph;
    static int R, C, H;
    static Queue<Pair> q = new LinkedList<>();

    static class Pair {
        int first, second, third;

        Pair(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    static int[][] dir = {{1, 0, 0}, {0, 1, 0}, {-1, 0, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};

    static void bfs() {
        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int r = p.first;
                int c = p.second;
                int h = p.third;
                for (int j = 0; j < 6; j++) {
                    int nr = r + dir[j][0];
                    int nc = c + dir[j][1];
                    int nh = h + dir[j][2];
                    if (nr >= 0 && nr < R && nc >= 0 && nc < C && nh >= 0 && nh < H && graph[nh][nr][nc] == 0) {
                        q.offer(new Pair(nr, nc, nh));
                        graph[nh][nr][nc] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < C; k++) {
                    if (graph[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(cnt - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        graph = new int[H][R][C];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < R; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < C; k++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                    if (graph[i][j][k] == 1) {
                        q.offer(new Pair(j, k, i));
                    }
                }
            }
        }
        bfs();
    }
}