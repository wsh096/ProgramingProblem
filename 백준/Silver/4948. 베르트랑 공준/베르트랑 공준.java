import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        boolean[] isPrime = new boolean[246_913]; isPrime[1] = true;
               
        for(int i = 2; i*i <= 246912; i++){
           if(isPrime[i]) continue;
           for(int j = i*i; j <= 246912; j += i)
           isPrime[j] = true;
        }
                                               
        while(true){
            int A = Integer.parseInt(br.readLine());
            if(A == 0) break;
            
            int cnt = 0;
            for(int i = A+1; i <= 2*A; i++)
            if(!isPrime[i]) cnt++;
            
            sb.append(cnt).append("\n");
        }                                              
        System.out.println(sb);                                                                          
    }
}