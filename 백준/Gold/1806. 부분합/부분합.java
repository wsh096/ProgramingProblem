import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int total = 0;
        while (start <= n && end <= n) {
            if (total >= s && min > end - start) {
                min = end - start;
            }

            if (total < s) {
                if (end < n) {
                    total += nums[end++];
                } else {
                    break;
                }
            } else {
                total -= nums[start++];
            }
        }

        if (min == Integer.MAX_VALUE) {
            bw.write("0\n");
        } else {
            bw.write(min + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}