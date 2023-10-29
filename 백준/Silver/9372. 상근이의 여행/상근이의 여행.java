import java.io.*;
import java.util.*;
public class Main{
    static int n, m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            
            for(int i = 0; i < m; i++) br.readLine();
            
            sb.append((n - 1)).append("\n");
        }
        System.out.println(sb);
    }
}