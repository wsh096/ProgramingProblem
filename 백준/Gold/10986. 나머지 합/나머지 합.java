import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] sum = new int[n + 1];
        int[] arr = new int[n + 1];
        int[] remainder = new int[m];
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = (sum[i-1] + arr[i]) % m;
            remainder[(sum[i] + m) % m]++; 
        }
        long result = remainder[0];
        for(int i = 0; i < m; i++){
            result += (long)remainder[i] * (remainder[i] - 1) / 2;
        }
        System.out.println(result);
    }
}
