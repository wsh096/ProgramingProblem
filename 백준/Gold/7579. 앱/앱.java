import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M, sum;
    static int[] bite, cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bite = new int[N+1];
        cost = new int[N+1];
        dp = new int[N+1][10001];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            bite[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
            sum += cost[i];
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j - cost[i] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-cost[i]] + bite[i]);
                }
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= sum; i++) {
            if (dp[N][i] >= M) {
                sb.append(i).append("\n");
                break;
            }
        }
        System.out.println(sb);
    }
}