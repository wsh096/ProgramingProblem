import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            map.put(input[i],map.getOrDefault(input[i], 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        for(int i = 0; i < M; i++){
            sb.append(map.getOrDefault(input[i], 0));
            if(i < M - 1)sb.append(" ");
        }
        System.out.println(sb);
    }
}