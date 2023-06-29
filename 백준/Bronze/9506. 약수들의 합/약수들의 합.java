import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T == -1) break;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            int sum = 1;
            for(int i = 2; i <= T/2; i++){
                if(T % i == 0) {
                    sum += i;
                    queue.offer(i);           
                }
            }
            sb.append(T);
            if(sum == T){
                sb.append(" = ");
                while(!queue.isEmpty()){
                    sb.append(queue.poll());
                    if(queue.size() > 0) 
                        sb.append(" + ");
                }
            }
            else{
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}