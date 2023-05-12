import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long [] dp = new long[91]; dp[0] = 0; dp[1] = 1;
        for(int i = 2; i <= 90; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[Integer.parseInt(br.readLine())]);
    }
}