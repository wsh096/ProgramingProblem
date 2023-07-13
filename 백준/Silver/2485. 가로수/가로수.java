import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        
        for(int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(br.readLine());
        }
        int gcd = trees[1]-trees[0];
        for(int i = 2; i < N; i++){
            gcd = gcd(gcd, trees[i]-trees[i-1]);
        }
        System.out.println((trees[N - 1] - trees[0]) / gcd + 1 - N);
    }
    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}