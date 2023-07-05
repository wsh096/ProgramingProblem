import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                if(i < arr.length-1)
                sum += arr[i];
                else{
                    sum = sum <= arr[i] ? sum + sum-1 : sum + arr[i];
                }
            }
            System.out.println(sum);
        }
}