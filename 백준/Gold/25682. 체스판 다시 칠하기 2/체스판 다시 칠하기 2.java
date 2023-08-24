import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] board = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String row = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = board[i - 1][j] + board[i][j - 1] - board[i - 1][j - 1];
                if ((i + j) % 2 == 0 && row.charAt(j - 1) == 'B') board[i][j]++;
                if ((i + j) % 2 == 1 && row.charAt(j - 1) == 'W') board[i][j]++;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int repaintCount = board[i][j] - board[i - K][j] - board[i][j - K] + board[i - K][j - K];
                result = Math.min(result, Math.min(repaintCount, K * K - repaintCount));
            }
        }

        System.out.println(result);
    }
}
