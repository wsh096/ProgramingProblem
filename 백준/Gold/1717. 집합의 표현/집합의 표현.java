import java.io.*;
import java.util.*;

public class Main{
    static int[] parent;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        parent = new int[n + 1];
        for(int i = 1; i <= n; i++) parent[i] = i;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(cmd == 0) union(a, b);
            else if(cmd == 1) sb.append(isSameParent(a, b) ? "YES\n" : "NO\n");
            else continue;
        }
        System.out.println(sb);
    }
    private static int find(int x){
        if (x == parent[x]) {
            return x;
        }
 
        return parent[x] = find(parent[x]);
    }
    private static void union(int x, int y){
        x = find(x);
        y = find(y);
        
        if (x != y) {
            if (x < y) parent[y] = x;
            else parent[x] = y;
        }
    }
    private static boolean isSameParent(int x, int y){
        x = find(x);
        y = find(y);
        return x == y ? true : false;
    }
}