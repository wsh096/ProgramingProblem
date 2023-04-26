import java.util.*;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //정점의 수.
        int m = sc.nextInt(); //간선의 수.
        int v = sc.nextInt(); //탐색을 시작할 정점의 번호.
        
        boolean[][] graph = new boolean[n + 1][n + 1];//그래프의 생성.
        
       //간선 정보 입력 받기
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            //그래프 연결
            graph[a][b] = true;
            graph[b][a] = true;
        }
        
        //DFS 탐색
        boolean[] visited = new boolean[n+1];//방문 체크
        dfs(graph, visited, v);
        System.out.println();
        
        //BFS 탐색
        visited = new boolean[n+1]; //또 쓸 거라 갱신
        bfs(graph, visited, v);
        System.out.println();
    }
    //DFS 구현
    private static void dfs(boolean[][] graph, boolean[] visited, int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 1; i < graph.length; i++){
            if(graph[v][i] && !visited[i]){
                dfs(graph, visited, i);
            }
        }
    }
    
    //BFS 구현
    private static void bfs(boolean[][] graph, boolean[] visited, int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;
        
        while(!queue.isEmpty()){
            int cur = queue.poll();
            System.out.print(cur + " ");
            
            for(int i = 1; i < graph.length; i++){
                if(graph[cur][i] && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}