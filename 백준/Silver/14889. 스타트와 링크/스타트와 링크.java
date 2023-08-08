import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(minDifference);
    }

    public static void combination(int start, int depth) {
        if (depth == N / 2) {
            calculateDifference();
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void calculateDifference() {
        int startTeam = 0;
        int linkTeam = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startTeam += S[i][j];
                    startTeam += S[j][i];
                } else if (!visited[i] && !visited[j]) {
                    linkTeam += S[i][j];
                    linkTeam += S[j][i];
                }
            }
        }

        int difference = Math.abs(startTeam - linkTeam);
        minDifference = Math.min(minDifference, difference);
    }
}
