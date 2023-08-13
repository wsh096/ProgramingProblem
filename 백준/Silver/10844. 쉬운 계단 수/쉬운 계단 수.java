import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        final int MOD = 1000000000;
        
        long[][] dp = new long[N + 1][10];
        for(int i = 1; i < 10; i++){
            dp[1][i] = 1;
        }
        for(int i = 2; i <= N; i++){
            for(int j = 0; j < 10; j++){
                if(j == 0){
                    dp[i][j] = dp[i - 1][j + 1];
                }else if(j == 9) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }
        long result = 0;
        for(int j = 0; j < 10; j++){
            result = (result +dp[N][j]) % MOD;
        }
        System.out.println(result);
    }
}