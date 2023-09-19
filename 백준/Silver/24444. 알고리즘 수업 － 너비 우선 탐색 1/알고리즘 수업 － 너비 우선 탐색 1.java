import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, K;
    static List<Integer>[] connect;
    static int[] check;

    public static void bfs(int start) {
        int visit = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        check[start] = visit++;

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < connect[x].size(); i++) {
                int xx = connect[x].get(i);
                if (check[xx] == 0) {
                    check[xx] = visit++;
                    q.offer(xx);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        connect = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            connect[i] = new ArrayList<>();
        }

        check = new int[N + 1];

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            connect[x].add(y);
            connect[y].add(x);
        }

        solve();
    }

    public static void solve() {
        for (int i = 1; i <= N; i++) {
            Collections.sort(connect[i]);
        }
        bfs(K);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(check[i]).append("\n");
        }
        System.out.print(sb);
    }
}
