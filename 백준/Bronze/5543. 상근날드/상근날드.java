import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        for(int i = 0; i < 2; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp < A) A = tmp;
        }
        int B = Integer.parseInt(br.readLine());
        for(int i = 0; i < 1; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp < B) B = tmp;
        }
        
        System.out.println(A+B-50);
        br.close();
    }
}