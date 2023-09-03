import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    static final long MOD = 1000000007L;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long [][] result = pow(new long[][]{{1,1},{1,0}}, n);
        System.out.println(result[0][1]);
    }
    private static long[][] pow(long[][] A, long exp){
        if(exp == 1) return A;
        
        long[][] half = pow(A, exp / 2);
        long[][] result = multiply(half, half);
        
        if(exp % 2 == 1){
            result = multiply(result, A);
        }
        return result;
    }
    private static long[][] multiply(long[][] A, long[][] B){
        long[][] C = new long[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
                C[i][j] %= MOD;
            }
        }
        return C;
    }
}