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
        
        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum <= M && sum > result) result = sum;
                }
            }
        }
        System.out.println(result);
    }
}