import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] frame = new boolean[1000001];
        frame[0] = true;
        for (int i = 2; i <= 1000000; i++) {
            if(frame[i]) continue;
            for (int j = i * 2; j <= 1000000; j += i) {
                frame[j] = true;
            }
        }
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (!frame[i] && !frame[n - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}