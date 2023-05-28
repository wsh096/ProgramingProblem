import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            
            if(input[0].equals("push")){
               int push = Integer.parseInt(input[1]);
                stack.push(push);
            }
            
            if(input[0].equals("top")){
                if(stack.isEmpty()){
                  sb.append(-1).append("\n");  
                }else{
                  sb.append(stack.peek()).append("\n");  
                }   
            }
            
            if(input[0].equals("size")){
                sb.append(stack.size()).append("\n");
            }
            
            if(input[0].equals("pop")){
               if(stack.isEmpty()){
                  sb.append(-1).append("\n");  
                }else{
                  sb.append(stack.pop()).append("\n");  
                }    
            }
            
            if(input[0].equals("empty")){
                if(stack.isEmpty()){
                  sb.append(1).append("\n");  
                }else{
                  sb.append(0).append("\n");  
                }    
            }
            
        }
        
        System.out.println(sb);
        br.close();
    }
}