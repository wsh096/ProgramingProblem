import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int peopleNum = Integer.parseInt(br.readLine());
        Stack<Pair> st = new Stack<>();
        int now, cntSameHeight = 0;
        long cntPair = 0;
        for(int i = 0; i < peopleNum; ++i){
            now = Integer.parseInt(br.readLine());
            cntSameHeight = 1;
            while(!st.isEmpty() && st.peek().first < now){
                cntPair += st.peek().second;
                st.pop();
            }
            if(!st.isEmpty()){
                if(st.peek().first == now){
                    cntPair += st.peek().second;
                    cntSameHeight = (st.peek().second + 1);
                    if(st.size() > 1) ++cntPair;
                    st.pop();
                }else ++cntPair;
            }
            st.push(new Pair (now, cntSameHeight));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cntPair).append("\n");
        System.out.println(sb);
    }
    static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
}