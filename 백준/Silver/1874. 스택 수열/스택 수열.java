import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
public class Main{
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; 
        
        int num = 1;
        StringBuilder sb = new StringBuilder();
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
        
        int idx = 0;
        for(int i = 1; i <= N; i++){
            stack.push(i);
            sb.append("+\n");
            while(!stack.isEmpty() && stack.peek() == arr[idx]){
                stack.pop();
                sb.append("-\n");
                idx++;
            }
        }
        
        if(!stack.isEmpty()){
                System.out.println("NO");
        }else{
                System.out.println(sb);
        }
     }
}