import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(calculate(s));
        br.close();
    }
    private static int calculate(String s){
        String[] nums = s.split("-");
        int result = 0;
        
        if(nums.length > 0){
            if(s.startsWith("-"))
                result -= sum(nums[0]);
            else
            result += sum(nums[0]);
        }
        
        for(int i = 1; i < nums.length; i++)
            result -= sum(nums[i]);
        return result;
    }
    private static int sum(String s){
        String[] nums = s.split("\\+");//+는 정규식에서 약속기호기에 역슬래시 필수
        int sum = 0;
        for(String num : nums)
            sum += Integer.parseInt(num);
        
        return sum;
    }
}