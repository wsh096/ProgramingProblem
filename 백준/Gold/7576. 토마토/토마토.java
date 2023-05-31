import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[][] box;
    static int[][] days;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        m = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);
        box = new int[n][m];
        days = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(row[j]);
                days[i][j] = -1; // 초기값을 -1로 설정 0과 구분
            }
        }

        int answer = bfs();

        if (isAll()) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }

        br.close();
    }

    private static int bfs() {
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 1) {
                    queue.add(new Point(i, j));
                    days[i][j] = 0;
                }
            }
        }

        int maxDays = 0;

        while (!queue.isEmpty()) {
            Point curr = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];

                if (isValid(nx, ny) && box[nx][ny] == 0 && days[nx][ny] == -1) {
                    queue.add(new Point(nx, ny));
                    days[nx][ny] = days[curr.x][curr.y] + 1;
                    maxDays = Math.max(maxDays, days[nx][ny]);
                }
            }
        }

        return maxDays;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    private static boolean isAll() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0 && days[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
