import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        Set<String> set = new HashSet<>();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        for(int i = 0; i < N; i++) set.add(br.readLine());
        for(int i = 0; i < M; i++) if(set.contains(br.readLine())) cnt++;
        System.out.println(cnt);
    }
}