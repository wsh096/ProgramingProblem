import java.io.*;

public class Main{
    static int n;
    static int[] list;
    static int[] dp;
    static int[] tmp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        list = new int[n + 1];
        dp = new int[n + 1];
        tmp = new int[n + 1];
        
        int result = 0;
        int resultIdx = 0;
        
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            list[i] = Integer.parseInt(input[i]);
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(list[i] > list[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    tmp[i] = j;
                }
            }
            if(dp[i] > result){
                result = dp[i];
                resultIdx = i;
            }
        }
        int[] answer = new int[result];
        int idx = resultIdx;
        
        for(int i = result - 1; i >= 0; i--) {
            answer[i] = list[idx];
            idx = tmp[idx];
        }
        bw.write(result+"\n");
        for(int i : answer) bw.write(i+" ");
        
        bw.flush();
        br.close();
        bw.close();
    }
}