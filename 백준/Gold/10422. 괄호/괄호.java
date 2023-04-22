import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] dp = new long[5001];
        dp[0] = 1;

        for (int i = 2; i <= 5000; i += 2) {
            for (int j = 0; j <= i - 2; j += 2) {
                dp[i] = (dp[i] + (dp[j] * dp[i - j - 2]) % MOD) % MOD;
            }
        }

    
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
        sc.close();
    }
}