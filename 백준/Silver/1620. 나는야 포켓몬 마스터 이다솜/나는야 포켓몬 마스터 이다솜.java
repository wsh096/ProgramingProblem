import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map1 = new HashMap<>(); 
        Map<Integer, String> map2 = new HashMap<>(); 
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < N; i++) {
            String pokemon = br.readLine();
            map1.put(pokemon, i);    
            map2.put(i, pokemon);    
        }
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            if(Character.isDigit(temp.charAt(0))){ //숫자인 경우
                int B = Integer.parseInt(temp) - 1;//-1로 0부터 되는 index 커버.
                sb.append(map2.get(B)).append("\n");
            }else{//숫자인 경우.
                sb.append(map1.get(temp)+1).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}