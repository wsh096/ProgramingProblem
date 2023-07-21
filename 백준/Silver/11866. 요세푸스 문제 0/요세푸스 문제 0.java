import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++) queue.offer(i);
        while(!queue.isEmpty()){
            if(queue.size()==1){
                sb.append(queue.poll()).append(">");
                break;
            }
            int A = queue.poll();
            cnt++;
            if(cnt % K == 0){
                sb.append(A).append(", ");
            }else{
                queue.offer(A);
            }
        }
        System.out.println(sb);
    }
}