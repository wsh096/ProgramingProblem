import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int left, right;
        Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    static final int MAX = 10001;
    static final int INF = 987654321;
    static int N, nodeIdx;
    static int[] node = new int[MAX];
    static int[] low = new int[MAX];
    static int[] high = new int[MAX];
    static Node[] tree = new Node[MAX];

    public static void DFS(int nodeNum, int cnt) {
        if (tree[nodeNum].left > 0) {
            DFS(tree[nodeNum].left, cnt + 1);
        }

        low[cnt] = Math.min(low[cnt], nodeIdx);
        high[cnt] = Math.max(high[cnt], nodeIdx++);

        if (tree[nodeNum].right > 0) {
            DFS(tree[nodeNum].right, cnt + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < MAX; i++) {
            low[i] = INF;
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child1 = Integer.parseInt(st.nextToken());
            int child2 = Integer.parseInt(st.nextToken());

            node[parent]++;

            if (child1 != -1) {
                node[child1]++;
            }

            if (child2 != -1) {
                node[child2]++;
            }

            tree[parent] = new Node(child1, child2);
        }

        int root = 0;
        for (int i = 1; i <= N; i++) {
            if (node[i] == 1) {
                root = i;
            }
        }

        nodeIdx = 1;
        DFS(root, 1);

        int result = high[1] - low[1] + 1;
        int level = 1;
        for (int i = 2; i <= N; i++) {
            int temp = high[i] - low[i] + 1;
            if (temp > result) {
                result = temp;
                level = i;
            }
        }

        System.out.println(level + " " + result);
    }
}