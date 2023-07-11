import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] input = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(input[i]);
        }
        input = br.readLine().split(" ");
        for(int i = 0; i < M; i++){
            if(set.contains(input[i])) set.remove(input[i]);
            else set.add(input[i]);
        }
        
        System.out.println(set.size());
    }
}