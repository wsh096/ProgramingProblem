import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int num = 1;
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(input[i]);
            stack.push(n);
            while(!stack.isEmpty() && stack.peek() == num){
                stack.pop();
                num++;
            }
        }
            if(stack.isEmpty()){
                System.out.println("Nice");
            }else{
                System.out.println("Sad");
            }
    }
}
