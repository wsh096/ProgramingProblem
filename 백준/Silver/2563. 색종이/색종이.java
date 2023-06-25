import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{

public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A = 0;
    
    int N = Integer.parseInt(br.readLine());
 
    boolean[][] B = new boolean[100][100];
    
    for(int i = 0 ; i < N; i++){
      String[] input = br.readLine().split(" "); 
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        for(int j = X; j < X + 10; j++)
            for(int k = Y; k < Y + 10; k++){
                if(B[j][k]) continue;
                B[j][k] = true;
                A++;
            }            
    }
    System.out.println(A);
    }
}