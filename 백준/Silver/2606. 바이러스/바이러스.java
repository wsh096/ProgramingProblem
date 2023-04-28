import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//컴퓨터 수
        int edge = sc.nextInt();//연결 수.
        List<Integer>[] graph = new List[N+1];
        boolean[] visited = new boolean[N+1];//방문 확인 boolean 배열
        
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < edge; i++){ //양방향 그래프 생성.
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }
        
        
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true; //초기화
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : graph[cur]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}