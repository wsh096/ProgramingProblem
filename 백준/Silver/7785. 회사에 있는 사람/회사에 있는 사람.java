import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> set = new TreeSet<>();
        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            if(input[1].equals("enter")) set.add(input[0]);
            else if(set.contains(input[0])) set.remove(input[0]);
        }
        for(String  s : set) stack.push(s);
        while(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
        
        System.out.println(sb);
    }
}