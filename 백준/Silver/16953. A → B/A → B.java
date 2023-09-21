import java.util.Queue;
import java.util.LinkedList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    static int t;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int v = Integer.parseInt(input[0]);
        t = Integer.parseInt(input[1]);
        System.out.println(bfs(v, 1));
    }
    private static long bfs(int value, int level){
        Queue<long[]> queue = new LinkedList<>();
        queue.offer(new long[] {value, level});
        while(!queue.isEmpty()){
            long [] checker = queue.poll();
            if(checker[0] == t) return checker[1];
            if(checker[0] < t){
                queue.offer(new long[]{checker[0] * 2, checker[1] + 1});
                queue.offer(new long[]{checker[0] * 10 + 1, checker[1] + 1});
            }
        }
        return -1;
    }
}