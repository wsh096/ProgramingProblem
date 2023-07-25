import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int[] prefixSum = new int[N + 1];
        prefixSum[1] = arr[0];
        for (int i = 2; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int sum = prefixSum[end] - prefixSum[start - 1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
