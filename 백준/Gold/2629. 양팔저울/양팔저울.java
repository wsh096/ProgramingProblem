import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int n, bead, x;
    static int[] weight = new int[31];
    static boolean[][] dp = new boolean[31][15001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }
        solve(0, 0);

        bead = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bead; i++) {
            x = Integer.parseInt(st.nextToken());

            if (x > 15000) {
                sb.append("N ");
            } else if (dp[n][x]) {
                sb.append("Y ");
            } else {
                sb.append("N ");
            }
        }
        System.out.println(sb.toString());
    }

    public static void solve(int i, int w) {
        if (i > n || dp[i][w]) return;
        dp[i][w] = true;
        solve(i + 1, w + weight[i]);
        solve(i + 1, Math.abs(w - weight[i]));
        solve(i + 1, w);
    }
}
