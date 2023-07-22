import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] find = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }
        int cnt = 0;
        for(int i = 0; i < M; i++){
            while(true){
                int idx = ((LinkedList<Integer>) queue).indexOf(find[i]);
                if(idx == 0){
                    queue.poll();
                    break;
                }else if(idx <= queue.size() / 2){
                    ((LinkedList<Integer>) queue).addLast(((LinkedList<Integer>) queue).pollFirst());
                    cnt++;
                }else{
                    ((LinkedList<Integer>) queue).addFirst(((LinkedList<Integer>) queue).pollLast());
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}