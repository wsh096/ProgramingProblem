import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[] visited;
    static List<Integer>[] line;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        line = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            line[i] = new ArrayList<>();
        }

        visited = new int[N + 1];
        cnt = 1;

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            line[a].add(b);
            line[b].add(a);
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.print(sb.toString());
    }

    static void dfs(int t) {
        visited[t] = cnt;
        Collections.sort(line[t], (a,b)-> b - a);

        for (int i : line[t]) {
            if (visited[i] == 0) {
                cnt++;
                dfs(i);
            }
        }
    }
}
