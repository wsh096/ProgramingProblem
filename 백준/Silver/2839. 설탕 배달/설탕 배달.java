import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[T+3];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[3] = 1;
        dp[5] = 1;
        for(int i = 3; i <= T; i++){
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], i/3);
            }    
            if(i % 5 == 0){
                dp[i] = Math.min(dp[i], i/5);
            }
            if(dp[i-3]!=Integer.MAX_VALUE){
                dp[i] = Math.min(dp[i], dp[i-3] + dp[3]);
            }   
        }
        
        if(dp[T]==Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(dp[T]);
        }
    }
}