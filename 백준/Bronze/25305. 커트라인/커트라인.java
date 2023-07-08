import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String[] basic = br.readLine().split(" ");
        int N = Integer.parseInt(basic[1]);
        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list.get(N-1));
        
    }
}