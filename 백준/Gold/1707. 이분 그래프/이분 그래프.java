import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private static void dfs(ArrayList<Integer>[] a, int[] color, int x, int c) {
        color[x] = c;
        for (int y : a[x]) {
            if (color[y] == 0) {
                dfs(a, color, y, 3 - c);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // testCase
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 정점의 수
            int m = Integer.parseInt(st.nextToken()); // 간선의 수

            ArrayList<Integer>[] a = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) { // 정점만큼 배열 어레이리스트 생성
                a[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int part1 = Integer.parseInt(st.nextToken());
                int part2 = Integer.parseInt(st.nextToken());

                a[part1].add(part2);
                a[part2].add(part1);
            }

            int[] color = new int[n + 1]; // 정점의 방문 여부
            // 0 : 방문 X, 1 : part1 소속 방문O , 2: part2 소속 방문O
            boolean ok = true;

            for (int i = 1; i <= n; i++) {
                if (color[i] == 0) // 정점 i 방문 X인 상태라면,
                    dfs(a, color, i, 1);
            }

            for (int i = 1; i <= n; i++) {
                for (int j : a[i]) {
                    if (color[i] == color[j]) {
                        ok = false;
                    }
                }
            }

            if (ok) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}