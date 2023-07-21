import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
       
        while(true){
         String input = br.readLine();
            if(input.equals(".")) break;
            if(isBalanced(input)){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
         System.out.println(sb);       
     }
    
    private static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(c=='(' || c =='['){
                stack.push(c);
            }else if((c==')'||c==']')){
                  if(stack.isEmpty()) return false;
                
                char top = stack.pop();
                if((c==')' && top != '(')|| (c==']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}