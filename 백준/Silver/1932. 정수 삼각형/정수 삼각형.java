import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
       static int[][] board; 
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][];
        for(int i = 0; i < n; i++){
          String[] input = br.readLine().split(" ");
            int m = input.length;
            board[i] = new int[m];
            for(int j = 0; j < m; j++){
                board[i][j] = Integer.parseInt(input[j]);
            }
        }
        dp = new int[n][n];
        dp[0][0] = board[0][0];
        for(int i = 1; i < n; i++){
            int m = board[i].length;
            dp[i][0] = dp[i - 1][0] + board[i][0];
            dp[i][m-1] = dp[i - 1][m - 2] + board[i][m - 1];
            for(int j = 1; j < m - 1; j++){
            dp[i][j] = Math.max(dp[i][j], Math.max(dp[i - 1][j - 1] + board[i][j], 
                                                   dp[i - 1][j] + board[i][j]));
    }
}
System.out.println(Arrays.stream(dp[n-1]).max().getAsInt());
    }}