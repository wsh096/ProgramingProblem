import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        long  [] arr = new long[n];
        String[] nums = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(nums[i]);
        }
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, n, t));
    }
    private static long  binarySearch(long [] arr, int n, int t){
        long  left = 0;
        long  right = arr[n - 1];
        long  answer = 0;
        while(left <= right){
            long  mid = left + (right - left) / 2;
            long  check = 0;
            for(int i = n - 1; i >= 0; i--){
                check += arr[i] > mid ? arr[i] - mid : 0;
                if(check >= t) break;
            }
            if(check >= t){
                answer = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return answer;
    }
}