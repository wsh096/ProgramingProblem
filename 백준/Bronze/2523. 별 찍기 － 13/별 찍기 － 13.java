import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        while(true){
            int B = 1;
            while(B < A){
                for(int i = 0; i < B; i++) sb.append("*");
                sb.append("\n");
                B++;
            }
         
            while(B > 0){
                for(int i = 0; i < B; i++) sb.append("*");
                sb.append("\n");
                B--;
            }
            if(B == 0) break;
        }
        System.out.println(sb);
        br.close();
    }
}