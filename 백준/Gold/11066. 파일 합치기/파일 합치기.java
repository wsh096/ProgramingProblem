import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] files = new int[K + 1];
            int[] sum = new int[K + 1];
            int[][] dp = new int[K + 1][K + 1];

            for (int i = 1; i <= K; i++) {
                files[i] = Integer.parseInt(input[i - 1]);
                sum[i] = sum[i - 1] + files[i];
            }

            for (int gap = 1; gap < K; gap++) {
                for (int i = 1; i + gap <= K; i++) {
                    int j = i + gap;
                    dp[i][j] = Integer.MAX_VALUE;

                    for (int k = i; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum[j] - sum[i - 1]);
                    }
                }
            }
            System.out.println(dp[1][K]);
        }
    }
}
