import java.io.*;
import java.util.*;

public class Main{
    static int n;
    static int [] parent;
    static boolean[] isVisit;
    static StringTokenizer st;
    static List<Integer> list[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        isVisit = new boolean[n + 1];
        list = new ArrayList[n + 1];
        parent = new int[n + 1];
        
        for(int i = 0; i < n + 1; i++) list[i] = new ArrayList<>();
        
        for(int i = 0; i < n - 1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            list[a].add(b); list[b].add(a);//노드 연결
        }
        dfs(1);
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i < parent.length; i++)
            sb.append(parent[i]).append("\n");
        System.out.print(sb);
    }
    private static void dfs(int idx){
        isVisit[idx] = true;
        for(int i : list[idx]){
            if(!isVisit[i]){
                parent[i] = idx;
                dfs(i);
            }
        }
    }
}