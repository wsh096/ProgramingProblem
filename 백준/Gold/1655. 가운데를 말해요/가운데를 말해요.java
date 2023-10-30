import java.io.*;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            
            if(minHeap.size() == maxHeap.size()) maxHeap.offer(num);
            else minHeap.offer(num);
            
            if(!minHeap.isEmpty() && !maxHeap.isEmpty()) 
                if(minHeap.peek() < maxHeap.peek()){
                    int tmp = minHeap.poll();
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(tmp);
                }
            sb.append(maxHeap.peek()).append("\n");
        }
        System.out.print(sb);
    }
}