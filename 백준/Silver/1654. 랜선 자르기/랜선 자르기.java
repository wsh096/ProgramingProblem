import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        long [] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);
        
        long answer = lanDivided(n , k, arr);
        System.out.println(answer);
    }
    
    private static long lanDivided(int n, int k, long[] lan){
        long left = 1; // 최소 길이
        long right = lan[n - 1]; // 최대 길이
        long answer = 0;
        
        while(left <= right){
            long mid = (left + right) / 2;
            long cnt = 0; // int 범위를 넘을 수 있으므로 long으로 선언
            
            for(int i = 0; i < n; i++){
                cnt += lan[i] / mid;
            }
            
            if(cnt < k){ // 너무 길게 잘랐다면
                right = mid - 1;
            }else{ // 너무 짧게 잘랐거나, 딱 좋게 잘랐다면
                left = mid + 1;
                answer = mid; // 가능한 랜선의 길이 중 가장 큰 것을 저장
            }
        }
        
        return answer;
    }
}