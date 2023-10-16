import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int[] check = new int[100001];
    static int[] before = new int[100001];
    static int N;
    static int K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        if (N == K) {
            System.out.println(0);
            System.out.println(N);
        } else {
            findK(N);
            StringBuilder sb = new StringBuilder();
            sb.append(check[K]).append("\n");
            Stack<Integer> stack = new Stack<>();
            int after = K;
            while (after != N) {
                stack.push(after);
                after = before[after];
            }
            stack.push(N);

            while (!stack.isEmpty()) {
                sb.append(stack.pop()).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    public static void findK(int n) {
        Queue<Integer> que = new LinkedList<>();
        que.add(n);

        while (!que.isEmpty()) {
            int X = que.poll();
            if (X == K)
                break;
            if (X > 0 && check[X - 1] == 0) {
                que.add(X - 1);
                check[X - 1] = check[X] + 1;
                before[X - 1] = X;
            }
            if (X + 1 < check.length && check[X + 1] == 0) {
                que.add(X + 1);
                check[X + 1] = check[X] + 1;
                before[X + 1] = X;
            }
            if (X * 2 < check.length && check[X * 2] == 0) {
                que.add(X * 2);
                check[X * 2] = check[X] + 1;
                before[X * 2] = X;
            }
        }
    }
}
