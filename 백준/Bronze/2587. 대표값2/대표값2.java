import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
            sum += a;
        }
        Arrays.sort(arr);
        sb.append(sum/5).append("\n");
        sb.append(arr[2]);
        System.out.println(sb);
        br.close();
    }
}