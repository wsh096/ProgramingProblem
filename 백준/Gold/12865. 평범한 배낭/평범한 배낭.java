import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //물품
        int K = sc.nextInt(); //최대 무게
        int[][] dp = new int[N+1][K+1];
        int[] w = new int[N+1];
        int[] v = new int[N+1];
        for(int i = 1; i <= N; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                if(j < w[i]){//물건의 무게가 너무 무거움
                    dp[i][j] = dp[i-1][j];
                }else{//이전물건의 값과, 이전물건 중 현재의 무게-이전무게+v[i];
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
                }
            }
        }
    System.out.println(dp[N][K]);
    }
}