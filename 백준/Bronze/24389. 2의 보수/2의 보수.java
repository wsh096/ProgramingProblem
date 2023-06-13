import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int answer  = 0;

        char[] B = Integer.toBinaryString(A).toCharArray();
        char[] C = Integer.toBinaryString(-A).toCharArray();
        int idx = C.length-1;

        for(int i = B.length-1; i >= 0; i--){
            if(B[i] != C[idx--]){
                answer++;
            }
        }
        answer += idx + 1;
        
        System.out.println(answer);
        br.close();
    }
}