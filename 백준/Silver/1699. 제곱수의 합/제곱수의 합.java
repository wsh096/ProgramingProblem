import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(lagrange(N));
    }

    public static int lagrange(int n) {
        int a = (int)Math.sqrt(n);
        if ( a*a == n)
            return 1;

        while (n % 4 == 0)
            n = n / 4;

        if (n % 8 == 7)
            return 4;

        for (int i = 0; i <= a; i++) {
            int j = (int) Math.sqrt(n - i * i);
            if (j * j == n - i * i) {
                return 2;
            }
        }
        return 3;
    }
}