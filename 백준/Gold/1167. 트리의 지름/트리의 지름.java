import java.io.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Node>[] list;
    static boolean[] visited;
    static int max = 0;
    static int node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int index = 1;
            while (index < input.length - 1) {
                int e = Integer.parseInt(input[index]);
                int cost = Integer.parseInt(input[index + 1]);
                list[s].add(new Node(e, cost));
                index += 2;
            }
        }

        visited = new boolean[n + 1];
        dfs(1, 0);

        visited = new boolean[n + 1];
        dfs(node, 0);

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }

    public static void dfs(int x, int len) {
        if (len > max) {
            max = len;
            node = x;
        }
        visited[x] = true;

        for (int i = 0; i < list[x].size(); i++) {
            Node n = list[x].get(i);
            if (!visited[n.e]) {
                dfs(n.e, n.cost + len);
                visited[n.e] = true;
            }
        }
    }

    public static class Node {
        int e;
        int cost;

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }
    }
}