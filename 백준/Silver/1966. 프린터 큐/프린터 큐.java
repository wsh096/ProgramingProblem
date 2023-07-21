import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class PrinterQueue{
    int value;
    int idx;
    PrinterQueue(int value, int idx){
        this.value = value;
        this.idx = idx;
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Queue<PrinterQueue> queue = new LinkedList<>();
            
            for(int i = 0; i < arr.length; i++){
                queue.offer(new PrinterQueue(arr[i], i));
            }
            while(true){
                int max = Arrays.stream(arr).max().getAsInt();
                PrinterQueue temp = queue.poll();
                if(max > temp.value){
                    queue.offer(temp);
                }else{
                    cnt++;
                    if(M == temp.idx){
                        sb.append(cnt).append("\n");
                        break;
                    }else{
                        arr[temp.idx] = -1;
                        max = Arrays.stream(arr).max().getAsInt();
                    }
                 }  
            }
        }
        System.out.println(sb);
    }
}