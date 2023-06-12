import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        int minOdd = Integer.MAX_VALUE; 
        for(int i = 0; i < 7; i++){
            int A = Integer.parseInt(br.readLine());
            if(A % 2 == 1) {
                sum += A;
                minOdd = minOdd > A ? A : minOdd;
            }
        }
        if(sum!=0){
        sb.append(sum).append("\n").append(minOdd).append("\n");
        System.out.println(sb);
        }else
        System.out.println(-1);
        br.close();
    }
}