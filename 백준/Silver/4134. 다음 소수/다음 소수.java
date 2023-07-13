import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long T = Long.parseLong(br.readLine());

        for (long t = 0; t < T; t++) {
            BigInteger n = new BigInteger(br.readLine());
            while (!n.isProbablePrime(1)) {
                n = n.add(BigInteger.ONE);
            }
            sb.append(n).append("\n");
        }
        System.out.print(sb);
    }

}
