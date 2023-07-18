import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.readLine();
        int cnt = 0;
        Set<String> set = new HashSet<>();
        for(int i = 1; i < N; i++){
            String temp = br.readLine();
            if(temp.equals("ENTER")){
                cnt+=set.size();
                set.clear();
            }else
                set.add(temp);
            if(i==N-1) cnt += set.size();
        }
        System.out.println(cnt);
    }
}