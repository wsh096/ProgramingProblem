import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static int[] f;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        f = new int[N + 1];
        System.out.printf("%d %d",fibo(N), N-2);
    }
    private static int fibo(int n){
        if(n <= 2) return 1;
        else f[n] = fibo(n - 1) + fibo(n - 2);
        return f[n];
    }
}