import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(B.readLine());
        int[] D = new int [N+1];
        D[0] = 0;
        D[1] = 1;
    
        for(int I = 2; I <= N; I++){
            D[I] = D[I-2] + D[I-1];
        }
        System.out.println(D[N]);
    }
}