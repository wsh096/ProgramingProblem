import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            BigInteger n = new BigInteger(br.readLine());
            while (!n.isProbablePrime(1)) {
                n = n.add(BigInteger.ONE);
            }
            System.out.println(n);
        }
    }
}
