import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();    
        String s = br.readLine();
        int len = s.length();
        for(int i = 0; i < len; i+=10){
            sb.append(s.substring(i,Math.min(s.length(),i + 10)));
            sb.append("\n");
        }               
        
        System.out.println(sb);
        br.close();
    }
}