import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        
        boolean[] frame = new boolean[N+1];
        
        for(int i = 2; i <= N; i++){
            if(frame[i]) continue;
            if(i >= M) sb.append(i).append("\n");
            for(int j = i+i; j <= N; j += i)
                    frame[j] = true; 
        }
        
      System.out.println(sb);
        
        br.close();
    }
}