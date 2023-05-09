import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[10001]; prime[0] = true; prime[1] = true;
        for(int i = 2; i * i < prime.length; i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j+=i)
            if(!prime[j]) prime[j] = true;
        }
        
        while(T-- > 0){

            int A = Integer.parseInt(br.readLine());
            int first = A/2;
            int second = A/2;

            while(prime[first]||prime[second]){
                first--; second++;
            }

            sb.append(first).append(" ").append(second).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}