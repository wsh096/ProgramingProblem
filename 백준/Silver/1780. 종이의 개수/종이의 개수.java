import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] paper;
    static int minusOneCount = 0;
    static int zeroCount = 0;
    static int oneCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divideAndConquer(0, 0, N);

        System.out.println(minusOneCount);
        System.out.println(zeroCount);
        System.out.println(oneCount);
    }

    public static void divideAndConquer(int x, int y, int size) {
        if (isSame(x, y, size)) {
            if (paper[x][y] == -1) {
                minusOneCount++;
            } else if (paper[x][y] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divideAndConquer(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    public static boolean isSame(int x, int y, int size) {
        int firstValue = paper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (firstValue != paper[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
