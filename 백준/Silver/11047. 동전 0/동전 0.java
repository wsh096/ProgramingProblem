import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);
        int [] coin = new int[n];
        int idx = n - 1;
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp > target){
                idx = i - 1;
                break;
            }
            coin[i] = temp;
        }
        
        int cnt = 0;
        while(idx >= 0 && target > 0) {
            if(target < coin[idx]){
                idx--; 
                continue;
            }
            int temp = target / coin[idx];
            cnt += temp;
            target -= temp * coin[idx--];
        }
        System.out.println(cnt);
    }
}