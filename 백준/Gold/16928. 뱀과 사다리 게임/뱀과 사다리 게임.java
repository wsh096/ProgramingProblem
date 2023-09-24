import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] moves = new int[101];

        for (int i = 1; i <= 100; i++) {
            moves[i] = i;
        }

        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            moves[start] = end;
        }

        int[] dist = new int[101];
        for (int i = 1; i <= 100; i++) {
            dist[i] = -1;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        dist[1] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int dice = 1; dice <= 6; dice++) {
                int next = current + dice;
                if (next <= 100) {
                    next = moves[next];
                    if (dist[next] == -1) {
                        dist[next] = dist[current] + 1;
                        queue.offer(next);
                    }
                }
            }
        }

        System.out.println(dist[100]);
    }
}
