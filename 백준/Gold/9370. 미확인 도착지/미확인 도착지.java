import java.io.*;
import java.util.*;

public class Main {
    private static final int INF = 100000000;

    static class Node implements Comparable<Node> {
        int v, weight;

        public Node(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int tCount = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            List<List<Node>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                int weight = (a == g && b == h) || (a == h && b == g) ? d * 2 - 1 : d * 2;
                graph.get(a).add(new Node(b, weight));
                graph.get(b).add(new Node(a, weight));
            }

            List<Integer> candidates = new ArrayList<>();
            for (int i = 0; i < tCount; i++) {
                candidates.add(Integer.parseInt(br.readLine()));
            }

            int[] dist = dijkstra(s, graph);

            Collections.sort(candidates);

            for (int candidate : candidates) {
                if (dist[candidate] % 2 == 1) {
                    bw.write(candidate + " ");
                }
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }

    private static int[] dijkstra(int start, List<List<Node>> graph) {
        int n = graph.size() - 1;
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int v = current.v;
            int weight = current.weight;

            if (weight > dist[v]) continue;

            for (Node neighbor : graph.get(v)) {
                int u = neighbor.v;
                int newDist = dist[v] + neighbor.weight;

                if (newDist < dist[u]) {
                    dist[u] = newDist;
                    pq.add(new Node(u, newDist));
                }
            }
        }

        return dist;
    }
}