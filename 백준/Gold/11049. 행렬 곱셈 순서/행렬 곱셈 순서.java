import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private static final int INF = 1000000000;
    private static int N;
    private static int[][] matrix = new int[502][2]; // Increased the size by 1 to avoid potential off-by-one errors
    private static int[][] dp = new int[502][502];   // Same here

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            matrix[i][0] = Integer.parseInt(input[0]);
            matrix[i][1] = Integer.parseInt(input[1]);
        }

        for (int len = 2; len <= N; len++) {
            for (int i = 1; i <= N - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = INF;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + matrix[i][0] * matrix[k][1] * matrix[j][1]);
                }
            }
        }

        System.out.println(dp[1][N]);
    }
}
