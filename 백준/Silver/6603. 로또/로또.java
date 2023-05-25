import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("0")) break;
            int n = Integer.parseInt(input[0]);
            int[] nums = new int[n];
            boolean[] visited = new boolean[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(input[i+1]);
            
            out(nums, visited, 0, 0, sb);
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    private static void out(int[] nums, boolean[] visited, int start, int depth, StringBuffer sb){
         if(depth == 6) {
             for(int i = 0; i < nums.length; i++){
                 if(visited[i]){
                     sb.append(nums[i]).append(" ");
                 }
             }
             sb.append("\n");
             return;
         }   
        
        for(int i = start; i < nums.length; i++){
            visited[i] = true;
            out(nums, visited, i + 1, depth + 1, sb);
            visited[i] = false;
        }
    }
}