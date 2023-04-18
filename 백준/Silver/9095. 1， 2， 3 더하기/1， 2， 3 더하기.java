import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] dp = new int[11];//11보다 작다는 < 11 10칸 즉, 그 보다 많은 칸 할애
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j <= 3; j++){//1,2,3으로 구성
                if(i >= j)
                    dp[i] += dp[i-j];
            }
        }
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }

    }
}