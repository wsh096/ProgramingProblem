import java.io.*;

public class Main {
    static int n, idx;
    static int[] in, post, pre;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        in = new int[n];
        post = new int[n];
        pre = new int[n];

        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            in[i] = Integer.parseInt(arr[i]);

        arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            post[i] = Integer.parseInt(arr[i]);

        makePreOrder(0, n - 1, 0, n - 1);
        for (int num : pre)
            bw.write(num + " ");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void makePreOrder(int inOrderStart, int inOrderEnd, int postOrderStart, int postOrderEnd) {
        if (inOrderStart <= inOrderEnd && postOrderStart <= postOrderEnd) {
            pre[idx++] = post[postOrderEnd];
            int pos = inOrderStart;
            for (int i = inOrderStart; i <= inOrderEnd; i++) {
                if (in[i] == post[postOrderEnd]) {
                    pos = i;
                    break;
                }
            }
            makePreOrder(inOrderStart, pos - 1, postOrderStart, postOrderStart + pos - inOrderStart - 1);

            makePreOrder(pos + 1, inOrderEnd, postOrderStart + pos - inOrderStart, postOrderEnd - 1);
        }
    }
}
