import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] nums = new int[A];
        for(int i = 0; i < A; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i = A-1; i >= 0; i--){
            if(nums[i] > max){
                max = nums[i]; 
                cnt++;
            }
        }
        
        System.out.println(cnt);
        br.close();
    }
}