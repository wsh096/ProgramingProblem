import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] dp = new int[n + 1];
        int before[] = new int[n + 1];
        dp[1] = 0;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + 1; // -1
            before[i] = i - 1;
            
            if(i % 3 == 0 && dp[i / 3] + 1 < dp[i]){
                dp[i] = dp[i / 3] + 1; // divide3
                before[i] = i / 3;
            }
            
            if(i % 2 == 0 && dp[i / 2] + 1 < dp[i]){
                dp[i] = dp[i / 2] + 1; //divide2
                before[i] = i / 2;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(dp[n]).append("\n");
        while(n > 0){
            sb.append(n).append(" ");
            n = before[n];
        }
        System.out.println(sb);
    }
}