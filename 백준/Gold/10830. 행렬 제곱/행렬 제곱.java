import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    static int N;
    static long B;
    static int MOD = 1000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Long.parseLong(st.nextToken());
        
        int [][] A = new int[N][N];
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] result = pow(A,B);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    private static int[][] pow(int[][] A, long exp){
        if(exp == 1){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    A[i][j] %= MOD;
                }
            }
            return A;
        }
        int[][] half = pow(A, exp/2);
        int[][] result = multiply(half, half);
        
        if(exp % 2 == 1){
            result = multiply(result, A);
        }
        return result;
    }
    private static int[][] multiply(int[][] A, int[][] B){
        int[][] C = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    C[i][j] += A[i][k] *B[k][j];
                }
                C[i][j] %= MOD;
            }
        }
        return C;
    }
}