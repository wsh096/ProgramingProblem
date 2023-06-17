import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int target = Integer.parseInt(br.readLine());
        for(int i = 1; i < target; i++){
            char[] nums = String.valueOf(i).toCharArray();
            int sum = 0;
            for(int j = 0; j < nums.length; j++){
                sum += nums[j] - '0';
            }
            if(sum + i == target){
                answer = i;
                break;
            }
        }
            System.out.println(answer);
        
        br.close();
    }
}