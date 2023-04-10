import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> [] graph = new List[n+1];
        int[] indegree = new int[n+1];
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            indegree[b]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1; i <= n; i++){
            if(indegree[i] == 0){
                pq.add(i);
            }
        }
        while(!pq.isEmpty()){
            int cur = pq.poll();
            System.out.print(cur + " ");
            for(int next : graph[cur]) {
                indegree[next]--;
                if(indegree[next] == 0){
                    pq.add(next);
                }
            }
        }
        sc.close();
    }
}