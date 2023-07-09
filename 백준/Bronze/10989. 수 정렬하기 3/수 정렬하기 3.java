import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        for(int i = 0; i < A; i++){
             arr[i] = Integer.parseInt(br.readLine());
         }       
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i : arr) sb.append(i).append("\n");
        System.out.println(sb);
    }
}