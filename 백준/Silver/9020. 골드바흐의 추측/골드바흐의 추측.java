import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[10001]; prime[0] = true; prime[1] = true;
        for(int i = 2; i * i < prime.length; i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j+=i)
            if(!prime[j]) prime[j] = true;
        }
        while(T-- > 0){
            int[] ints = {0,10_001};
            int A = Integer.parseInt(br.readLine());
            for(int i = A-1; i >= 2; i--){
                if(!prime[i] && !prime[A-i] && Math.abs(i - (A-i)) <Math.abs(ints[1] - ints[0])){
                    ints = new int[] {A-i, i};
                }
            }
            bw.write(String.valueOf(ints[0]));
            bw.write(" ");
            bw.write(String.valueOf(ints[1]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}