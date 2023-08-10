import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(i == 0) {
                dp[0] = temp;
                max = temp;
            }
            else{
                dp[i] = dp[i - 1] + temp > temp ? dp[i - 1] + temp : temp;
                max = dp[i] > max ? dp[i] : max;
            }
        }
        System.out.println(max);
    }
}