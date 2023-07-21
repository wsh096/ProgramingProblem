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
            switch(input[0]){
                case "push_front":
                    dq.addFirst(Integer.parseInt(input[1]));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.removeFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.removeLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                     if(dq.isEmpty()){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}