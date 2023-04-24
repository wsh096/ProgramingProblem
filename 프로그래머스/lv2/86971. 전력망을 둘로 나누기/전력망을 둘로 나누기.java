import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        List<Integer> [] adj = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            adj[i] = new ArrayList<>();
        }
        
        for(int[] wire : wires){
            int a = wire[0], b = wire[1];
            adj[a].add(b);
            adj[b].add(a);
        }
        
        for(int[] wire : wires){
            int a = wire[0], b = wire[1];
            adj[a].remove(Integer.valueOf(b));
            adj[b].remove(Integer.valueOf(a));
            int cnt1 = dfs(a, adj, new boolean[n+1]);
            int cnt2 = dfs(b, adj, new boolean[n+1]);
            int diff = Math.abs(cnt1 - cnt2);
            answer = Math.min(answer, diff);
            adj[a].add(b);
            adj[b].add(a);
        }
        return answer;
    }
    private int dfs(int v, List<Integer> [] adj, boolean[] visited){
        visited[v] = true;
        int cnt = 1;
        for(int u : adj[v]){
            if(!visited[u]){
                cnt+=dfs(u,adj,visited);
            }
        }
        return cnt;
    }
}