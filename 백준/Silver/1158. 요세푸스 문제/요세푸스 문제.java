import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        List<Integer> josephus = new ArrayList<>();
        int idx = 0;
        while (!people.isEmpty()) {
            idx = (idx + K - 1) % people.size();
            josephus.add(people.remove(idx));
        }

        StringBuilder sb = new StringBuilder("<");
        for (int i = 0; i < josephus.size(); i++) {
            sb.append(josephus.get(i));
            if (i != josephus.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}