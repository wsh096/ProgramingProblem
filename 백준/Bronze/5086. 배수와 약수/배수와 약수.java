import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        while(true){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("0")&&input[1].equals("0")){break;}
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            if(A%B==0)sb.append("multiple\n");
            else if(B%A==0)sb.append("factor\n");
            else sb.append("neither\n");
        }
        System.out.println(sb);
        br.close();
    }
}