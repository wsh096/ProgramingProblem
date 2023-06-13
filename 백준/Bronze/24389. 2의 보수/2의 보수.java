import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();//이렇게 다 따로 받아야 오류가 생기지 않음!
        int A = Integer.parseInt(input);
        int answer  = 0;

        String B = Integer.toBinaryString(A);
        String C = Integer.toBinaryString(-A);
        int idx = C.length()-1;

        for(int i = B.length()-1; i >= 0; i--){
            if(B.charAt(i) != C.charAt(idx--)){
                answer++;
            }
        }
        answer += idx + 1;
        
        System.out.println(answer);
        br.close();
    }
}