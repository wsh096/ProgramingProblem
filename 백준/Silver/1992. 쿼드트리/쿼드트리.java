import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new char[N][N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        System.out.println(compress(0, 0, N));
    }

    static String compress(int x, int y, int n) {
        if (isUniform(x, y, n)) {
            return String.valueOf(board[x][y]);
        }

        StringBuilder sb = new StringBuilder("(");
        int newSize = n / 2;

        sb.append(compress(x, y, newSize));  // 왼쪽 위
        sb.append(compress(x, y + newSize, newSize));  // 오른쪽 위
        sb.append(compress(x + newSize, y, newSize));  // 왼쪽 아래
        sb.append(compress(x + newSize, y + newSize, newSize));  // 오른쪽 아래

        sb.append(")");
        return sb.toString();
    }

    static boolean isUniform(int x, int y, int n) {
        char first = board[x][y];

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (board[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
