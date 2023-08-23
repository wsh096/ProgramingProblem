import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        String bomb = br.readLine();
        char[] bombs = bomb.toCharArray();
        int m = bomb.length();
        StringBuilder sb = new StringBuilder();

        for (char c : str) {
            sb.append(c);
            if (sb.length() >= m && sb.substring(sb.length() - m).equals(bomb)) {
                sb.setLength(sb.length() - m);
            }
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
