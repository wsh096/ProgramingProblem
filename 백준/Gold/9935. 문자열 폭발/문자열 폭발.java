import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[] bomb = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : str) {
            sb.append(c);
            if (sb.length() >= bomb.length && sb.substring(sb.length() - bomb.length).equals(new String(bomb))) {
                sb.setLength(sb.length() - bomb.length);
            }
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
