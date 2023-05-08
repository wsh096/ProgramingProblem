import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        boolean[] Prime = new boolean[B+1];
        int sum = 0;
        int first = 0;
        for(int i = 2; i <= B; i++){
            if(Prime[i]) continue;
            if(!Prime[i] && i >= A && first == 0)
                first = i;
            if(!Prime[i] && i >= A) sum += i;
            for(int j = i*i; j <= B; j+=i) 
                Prime[j] = true;
        }
        
        if(sum == 0) bw.write("-1");
        else{
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(first));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}