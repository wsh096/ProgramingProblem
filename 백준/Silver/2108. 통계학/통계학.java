import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] freq = new int[8001];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            freq[arr[i] + 4000]++;
        }
        Arrays.sort(arr);
        
        int mean = (int) Math.round((double) sum / n);
        int median = n == 1 ? arr[0] : arr[n / 2];
        int mode = n == 1 ? arr[0] : getMode(freq);
        int range = n == 1 ? 0 : arr[n - 1] - arr[0];

        sb.append(mean).append('\n').append(median).append('\n').append(mode).append('\n').append(range);
        System.out.println(sb);
    }

    public static int getMode(int[] freq) {
        int maxFreq = Arrays.stream(freq).max().getAsInt();
        int mode = 0;
        boolean isSecond = false;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                if (!isSecond) {
                    mode = i - 4000;
                    isSecond = true;
                } else {
                    mode = i - 4000;
                    break;
                }
            }
        }
        return mode;
    }
}
