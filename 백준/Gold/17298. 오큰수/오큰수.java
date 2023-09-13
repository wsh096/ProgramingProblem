import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[N];
        int[] seq = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(input[i]);
        }

        for (int i = N - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= seq[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            s.push(seq[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if(i != N -1) sb.append(ans[i]).append(" ");
            else sb.append(ans[i]);
        }
        System.out.println(sb);
    }
}