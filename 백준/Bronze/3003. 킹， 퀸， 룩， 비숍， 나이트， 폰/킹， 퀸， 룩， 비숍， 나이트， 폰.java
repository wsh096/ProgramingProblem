import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int [] board = {1,1,2,2,2,8};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int A = Integer.parseInt(input[i]);
            int B = board[i];
            int C = B-A;
            sb.append(C);
            if(i != 5) sb.append(" ");
        }
        System.out.println(sb);
    }
}