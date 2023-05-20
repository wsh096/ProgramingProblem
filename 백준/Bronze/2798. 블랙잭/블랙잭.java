import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int N, M, result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        String[] numsStr = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) nums[i] = Integer.parseInt(numsStr[i]);
        
        recursive(0, 0, 0, nums);
        System.out.println(result);
    }
    private static void recursive(int index, int sum, int cnt, int[] nums){
    if(cnt == 3){
         if(sum <= M && sum > result) result = sum;
         return;
     }
     if(index >= N) return;
     recursive(index + 1, sum + nums[index], cnt + 1, nums);
     recursive(index + 1, sum, cnt, nums);
    }
}