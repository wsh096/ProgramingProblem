import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[][] arr = new int[A][2];
        for(int i = 0; i < A; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        
       Arrays.sort(arr,(a,b)->{if(a[0]==b[0]) return a[1]-b[1]; else return a[0]-b[0];});
       StringBuilder sb = new StringBuilder();
        for(int i = 0; i < A; i++)
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
       System.out.println(sb);
        
    }
}  