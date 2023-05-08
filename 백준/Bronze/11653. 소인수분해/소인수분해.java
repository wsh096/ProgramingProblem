import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
       for(int i = 2; i <= Math.sqrt(A); i++){
           while(A % i == 0){
                   bw.write(String.valueOf(i));
                   bw.newLine();
                   A /= i;
               }
           }
       
       if(A != 1) bw.write(String.valueOf(A));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
