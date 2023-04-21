import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        if(K==0)
          System.out.print(sc.nextLine());
        else{
            String[] input = sc.nextLine().split(",");
            Queue<Integer> queue = new LinkedList<>();
            int idx = 0;
            int before = - Integer.parseInt(input[idx++]);
            for(int i = 0; i < N-1; i++) queue.offer(Integer.parseInt(input[idx++]));
            int size = 0;
            while(K-- > 0 && !queue.isEmpty()){
                size = queue.size();
                for(int i = 0; i < size; i++){
                  before += queue.peek();
                  queue.offer(before);
                  before = - queue.poll();  
                }
                if(K > 0)
                before = - queue.poll();
            }
            size = queue.size();
            for(int i = 0; i < size; i++){ 
             if(i!=size-1) System.out.print(queue.poll()+",");
             else System.out.print(queue.poll());
          }
        }
    }
}