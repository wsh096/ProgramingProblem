import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int answer = 0;
        int[] dp = new int[10]; dp[0] = Integer.parseInt(br.readLine());
        for(int i = 1 ; i < 10; i++) {
            dp[i] = dp[i-1] + Integer.parseInt(br.readLine());
        } 
        int[] diff = new int[10];
        int value = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i < 10; i++){
            if(value >= Math.abs(100-dp[i])){
                value = Math.abs(100-dp[i]);
                idx = i;
            }
        }
 
        System.out.println(dp[idx]);
        br.close();
    }
}