import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        long [] factorial = new long[n + 1];
        factorial[0] = 1;
        for(int i = 1; i <= n; i++){
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }
        long denominator = (factorial[k] * factorial[n - k]) % MOD;
        long result = (factorial[n] * pow(denominator, MOD - 2)) % MOD;
        System.out.println(result);
    }
    private static long pow(long x, long y){
        if(y == 1){
            return x % MOD;
        }
        long temp = pow(x, y / 2);
        
        if(y % 2 == 1){
            return ((temp * temp) % MOD * x) % MOD;
        }
        return (temp * temp) % MOD;
    }
}