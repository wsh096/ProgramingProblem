import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]); 
            int b = Integer.parseInt(input[1]); 
            int g = gcd(a,b);
            sb.append(a*b/g+"\n");
        }
        System.out.println(sb);
        br.close();
    }
    private static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return a;
    }
}