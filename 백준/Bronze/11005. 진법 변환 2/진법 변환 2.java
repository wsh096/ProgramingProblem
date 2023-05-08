import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        
        while(N > 0){
            sb.insert(0, N % B >= 10 ? Character.toString('A' + (N % B - 10)) : N % B);
            N /= B;
        }
            
        System.out.println(sb);    
        br.close();
    }
}