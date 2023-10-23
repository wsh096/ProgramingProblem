import java.io.*;
import java.util.*;

public class Main {
    static int n, m, vertexCnt, edgeCnt, caseCnt;
    static List<Integer>[] graph;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();
        caseCnt = 0;
        while (true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0)
                break;
            visit = new boolean[n + 1];
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++)
                graph[i] = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
                graph[x].add(y);
                graph[y].add(x);
            }
            answer();
        }
        System.out.println(sb);
    }

    private static void answer() {
        caseCnt++;
        int treeCnt = 0;
        for (int i = 1; i <= n; i++) {
            if (visit[i])
                continue;
            vertexCnt = 0;
            edgeCnt = 0;
            dfs(i);
            if (edgeCnt == (vertexCnt - 1) * 2)
                treeCnt++;
        }
        sb.append("Case ").append(caseCnt).append(": ");
        if (treeCnt == 0)
            sb.append("No trees.");
        else if (treeCnt == 1)
            sb.append("There is one tree.");
        else
            sb.append("A forest of ").append(treeCnt).append(" trees.");
        sb.append("\n");
    }

    private static void dfs(int x) {
        vertexCnt++;
        edgeCnt += graph[x].size();
        visit[x] = true;
        for (int y : graph[x]) {
            if (!visit[y])
                dfs(y);
        }
    }
}