import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    static StringBuilder sb = new StringBuilder();
    private static void hanoi(int N, int from, int to){
        int via = 6 - from - to;//중간을 들리는 역할
        //종료조건
        if(N == 1){
            //String fromTo = String.format("%d %d\n", from, to);
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        if(N >= 2){
            hanoi(N - 1, from, via);//N-1개(전체)가 가야하는 방향성
            hanoi(1, from, to);// 맨 밑 1개가 가는 방향
            hanoi(N - 1, via, to); //중간으로 옮겨진 N-1개가 끝으로 이동
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //String times = String.format("%d\n", (1<<N)-1); 
        sb.append((1<<N)-1).append("\n");
        hanoi(N, 1, 3);
        System.out.println(sb);
    }
}