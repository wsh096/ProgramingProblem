import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String[] cmd = new String[10000];
            boolean[] visited = new boolean[10000];
            Queue<Integer> queue = new LinkedList<>();
            
            visited[a] = true;
            queue.offer(a);
            Arrays.fill(cmd,"");
            while(!queue.isEmpty() && !visited[b]){
                int now = queue.poll();
                int D = (2 * now) % 10000;
                int S = (now == 0) ? 9999 : now - 1;
                int L = (now % 1000) * 10 + now/1000;
                int R = (now % 10) * 1000 + now/10;
                
                if(!visited[D]){
                    queue.offer(D);
                    visited[D] = true;
                    cmd[D] = cmd[now] + "D";
                }
                if(!visited[S]){
                    queue.offer(S);
                    visited[S] = true;
                    cmd[S] = cmd[now] + "S";
                }
                if(!visited[L]){
                    queue.offer(L);
                    visited[L] = true;
                    cmd[L] = cmd[now] + "L";
                }
                if(!visited[R]){
                    queue.offer(R);
                    visited[R] = true;
                    cmd[R] = cmd[now] + "R";
                }
            }
            System.out.println(cmd[b]);
        }
    }
}