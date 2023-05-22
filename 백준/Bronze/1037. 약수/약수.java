import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] nums = new int[T];
        String[] input = br.readLine().split(" ");
       
        for(int i = 0; i < T; i++)
           nums[i] = Integer.parseInt(input[i]);
        
        Arrays.sort(nums);
        
        System.out.println(nums[0]*nums[T-1]);
        br.close();
    }
}