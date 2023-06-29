import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int answer = 0;
        for(int i = 1; i <= A; i++){
            if(A%i==0)B--;
            if(B == 0) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}