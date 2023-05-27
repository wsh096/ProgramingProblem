import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] homes = new int[N][3];
        boolean[][] visited = new boolean[N][3];
        
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < 3; j++){
                homes[i][j] = Integer.parseInt(input[j]);
            }
        }
        //2,2,3
        //1,100,120
        //100,10,5일때 dp로 풀지 않으면 최적해 안 나옴.
        int[][] dp = new int[N][3];
        for(int i = 0; i < 3; i++) dp[0][i] = homes[0][i]; 
        for(int i = 1; i < N; i++) Arrays.fill(dp[i],Integer.MAX_VALUE);
        int answer = 0;
        for(int i = 1; i < N; i++){
            for(int j = 0; j < 3; j++){ 
                for(int k = 0; k < 3; k++){
                  if(j==k) continue;
                  dp[i][j] = Math.min(dp[i][j],homes[i][j] + dp[i-1][k]);   
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++)
            min = Math.min(min,dp[N-1][i]);
        
        System.out.println(min);
        
        br.close();
    }
}