import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<Pair> q = new LinkedList<>();
    static boolean[] visit = new boolean[100001];
    static int N, K, result;

    static class Pair {
        int data;
        int depth;

        public Pair(int data, int depth) {
            this.data = data;
            this.depth = depth;
        }
    }

    static boolean valid(int n) {
        if (n < 0 || n > 100000 || visit[n])
            return false;
        return true;
    }

    static void bfs(int n) {
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int data = pair.data;
            int depth = pair.depth;

            if (data == K) {
                result = depth;
                break;
            }

            if (valid(data - 1)) {
                visit[data - 1] = true;
                q.offer(new Pair(data - 1, depth + 1));
            }
            if (valid(data + 1)) {
                visit[data + 1] = true;
                q.offer(new Pair(data + 1, depth + 1));
            }
            if (valid(data * 2)) {
                visit[data * 2] = true;
                q.offer(new Pair(data * 2, depth + 1));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        q.offer(new Pair(N, 0));
        visit[N] = true;
        bfs(N);

        System.out.println(result);
    }
}
