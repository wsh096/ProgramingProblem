import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;   
public class Main{
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        String[] in1 = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++)
            set.add(Integer.parseInt(in1[i]));
        M = Integer.parseInt(br.readLine());
        String[] in2 = br.readLine().split(" ");
        for(int i = 0; i < M; i++){
            int A = Integer.parseInt(in2[i]);
            if(set.contains(A)){
                sb.append("1 ");
            }
            else sb.append("0 ");
        }
        System.out.println(sb.toString().substring(0,M*2));
        br.close();
    }
}