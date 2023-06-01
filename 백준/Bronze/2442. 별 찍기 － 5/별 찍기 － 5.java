import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            for(int j = N - i; j > 0; j--)//띄어쓰기
                sb.append(" ");
            for(int k = 0; k < 2*i-1; k++)//별
            sb.append("*");
            
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}