import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int num, int idx) {
        if(idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i = 0; i < 4; i++) {
            if(operators[i] > 0) {
                operators[i]--;

                switch(i) {
                    case 0: dfs(num + numbers[idx], idx + 1); break;
                    case 1: dfs(num - numbers[idx], idx + 1); break;
                    case 2: dfs(num * numbers[idx], idx + 1); break;
                    case 3: dfs(num / numbers[idx], idx + 1); break;
                }

                operators[i]++;
            }
        }
    }
}
