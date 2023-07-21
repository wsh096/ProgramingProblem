import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main{
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push")){
                dq.add(Integer.parseInt(input[1]));
            }else if(input[0].equals("pop")){
                if(dq.isEmpty()){
                    sb.append("-1\n");
                }else sb.append(dq.remove()).append("\n");
            }else if(input[0].equals("size")){
                sb.append(dq.size()).append("\n");
            }else if(input[0].equals("empty")){
                if(dq.size()==0){
                    sb.append("1\n");
                }else{
                    sb.append("0\n");
                }
            }else if(input[0].equals("front")){
                if(dq.peek()!=null){
                    sb.append(dq.peek()).append("\n");
                }else{
                    sb.append("-1\n");
                }
            }else if(input[0].equals("back")){
                if(dq.peekLast()!=null){
                    sb.append(dq.peekLast()).append("\n");
                }else{
                    sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);
    }
}