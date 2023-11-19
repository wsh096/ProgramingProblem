import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] info = br.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int m = Integer.parseInt(info[1]);

        int[] edgeCnt = new int[n + 1];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n + 1; i++)
            graph.add(new ArrayList<Integer>());

        for (int i = 0; i < m; i++) {
            String[] temp = br.readLine().split(" ");
            graph.get(Integer.parseInt(temp[0])).add(Integer.parseInt(temp[1]));
            edgeCnt[Integer.parseInt(temp[1])]++;
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < edgeCnt.length; i++)
            if (edgeCnt[i] == 0) q.offer(i);

        while (!q.isEmpty()) {
            int studentNo = q.poll();
            bw.write(String.valueOf(studentNo) + " ");
            List<Integer> list = graph.get(studentNo);

            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
                edgeCnt[temp]--;
                if (edgeCnt[temp] == 0) q.offer(temp);
            }
        }
        bw.flush();
    }
}