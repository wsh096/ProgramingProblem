import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        Map<Integer, PriorityQueue<String>> map = new TreeMap<>();
        
        for(int i = 0; i < A; i++){
            String input = br.readLine();
            int len = input.length();
            if(map.containsKey(len)){
                if(map.get(len).contains(input)) continue;
                map.get(len).offer(input);
            }else{
                PriorityQueue<String> pq = new PriorityQueue<>();
                pq.offer(input);
                map.put(len, pq);
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i : map.keySet()){
            while(!map.get(i).isEmpty())
                sb.append(map.get(i).poll()+"\n");   
        }
        
        System.out.println(sb);    
        br.close();
    }
}