import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        Set<String> save = new TreeSet<>();
        
        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            if(set.contains(temp)) save.add(temp);
        }
        sb.append(save.size()).append("\n");
        for(String s : save) sb.append(s).append("\n");
        
        System.out.println(sb);
    }
}