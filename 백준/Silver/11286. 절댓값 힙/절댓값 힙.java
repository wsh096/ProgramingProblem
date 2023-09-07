import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if(absA == absB){
                return Integer.compare(a, b); // a b 로 하면 내림차순 / b a로 하면 오름차순
            }else{
                return Integer.compare(absA, absB); // absA absB 내림차순 / absB absA 오름차순
            }
        });
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pq.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else{
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}