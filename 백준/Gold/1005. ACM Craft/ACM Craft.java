import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    static int T,N,E,W;
    static int[] dp, time, inDegree;
    static ArrayList<Integer> [] adj;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0){
            N = sc.nextInt();
            E = sc.nextInt();
            dp = new int[N+1];
            time = new int[N+1];
            inDegree = new int[N+1];
            adj = new ArrayList[N+1];
            for(int i = 1; i <= N; i++){
                adj[i] = new ArrayList<>();
                time[i] = sc.nextInt();
            }
            for(int i = 0; i < E; i++){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                adj[X].add(Y);
                inDegree[Y]++;
            }
            W = sc.nextInt();
            System.out.println(topologySort());
        }
        sc.close();   
        }
    private static int topologySort(){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<= N; i++){
            if(inDegree[i]==0){
                queue.offer(i);//방문처리를 위해서와 최초 헤드.
                dp[i]=time[i];//dp값 변경   
            }
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : adj[cur]){
                inDegree[next]--;
                dp[next] = Math.max(dp[next],dp[cur]+time[next]);
                if(inDegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        return dp[W];
    }
}