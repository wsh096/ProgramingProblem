import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
    static int N;
    static int ans;
    static int[] column; // 같은 열에 퀸이 있는지 체크
    static int[] incDiagonal; // 증가하는 대각선에 퀸이 있는지 체크
    static int[] decDiagonal; // 감소하는 대각선에 퀸이 있는지 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        column = new int[N];
        incDiagonal = new int[2 * N - 1]; // 2N - 1이 최대 가능한 대각선의 수
        decDiagonal = new int[2 * N - 1];

        backtrack(0);

        System.out.println(ans);
    }

    private static void backtrack(int row) {
        if (row == N) {
            ans++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (column[col] + incDiagonal[row + col] + decDiagonal[row - col + N - 1] == 0) {
                column[col] = incDiagonal[row + col] = decDiagonal[row - col + N - 1] = 1;
                backtrack(row + 1);
                column[col] = incDiagonal[row + col] = decDiagonal[row - col + N - 1] = 0;
            }
        }
    }
}