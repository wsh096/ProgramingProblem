import java.util.Map;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for(int i = 0; i < 3; i++){
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            xMap.put(A,xMap.getOrDefault(A,0)+1);
            yMap.put(B,yMap.getOrDefault(B,0)+1);
        }
        for(int i : xMap.keySet()){
            if(xMap.get(i) == 1){
                sb.append(i).append(" ");
            }
        }
        for(int i : yMap.keySet()){
             if(yMap.get(i) == 1){
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}