import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 500;
    static int N, M, Answer;
    static int[][] MAP = new int[MAX][MAX];
    static int[][] DP = new int[MAX][MAX];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                MAP[i][j] = Integer.parseInt(st.nextToken());
                DP[i][j] = -1;
            }
        }

        Answer = DFS(0, 0);
        System.out.println(Answer);
    }

    public static int DFS(int x, int y) {
        if (x == N - 1 && y == M - 1) return 1;
        if (DP[x][y] != -1) return DP[x][y];

        DP[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (MAP[nx][ny] < MAP[x][y]) {
                    DP[x][y] = DP[x][y] + DFS(nx, ny);
                }
            }
        }
        return DP[x][y];
    }
}
