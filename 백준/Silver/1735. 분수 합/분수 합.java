import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int E = A * D + C * B;
        int F = B*D;
        int gcd = gcd(E,F);
        StringBuilder sb = new StringBuilder();
        sb.append(E/gcd).append(" ").append(F/gcd);
        System.out.println(sb);
    }
    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a % b);
    }
}