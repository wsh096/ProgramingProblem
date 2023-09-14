import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] h = new int[100002];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 1; i <= N; i++){
            h[i] = Integer.parseInt(br.readLine());
        }
        s.push(0);
        for(int i = 1; i <= N + 1; i++){
            while(!s.isEmpty() && h[s.peek()] > h[i]){
                int check = s.pop();
                answer = Math.max(answer, h[check] * (i - s.peek() - 1));
            }
            s.push(i);
        }
        System.out.println(answer);
    }
}