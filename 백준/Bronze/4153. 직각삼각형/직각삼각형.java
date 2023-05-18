import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("0") && input[1].equals("0")&&input[2].equals("0")) break;
            int[] nums = new int[3];
            for(int i = 0; i < 3; i++) nums[i] = Integer.parseInt(input[i]);
            Arrays.sort(nums);
            int A = nums[0];
            int B = nums[1];
            int C = nums[2];
            if(A*A + B*B == C*C) sb.append("right");
            else sb.append("wrong");
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}