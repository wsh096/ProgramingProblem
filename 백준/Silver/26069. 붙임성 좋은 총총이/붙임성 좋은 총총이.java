import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");    
            String A = input[0]; String B = input[1];
            if (set.contains(A)) set.add(B);
            else if (set.contains(B)) set.add(A);
        }        

        System.out.println(set.size());
    }
}