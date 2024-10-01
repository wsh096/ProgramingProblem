import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= N;i++) {
            graph.add(new ArrayList<>());
        }    

        for(int i = 0; i < M; i++){
            String[] input = reader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        boolean visited[] = new boolean[N + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        int answer = 0;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int neighbor : graph.get(cur)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                    answer++;
            }
        }
    }
        System.out.println(answer);
    }
}