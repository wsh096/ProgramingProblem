import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars= br.readLine().toCharArray();
        int[] arr = new int[chars.length];
        for(int i = 0; i < chars.length; i++){
            arr[i] = chars[i]-'0';
        }
       Arrays.sort(arr);
       StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--)
            sb.append(arr[i]);
       System.out.println(sb);
        
    }
}  