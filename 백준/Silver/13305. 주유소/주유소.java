import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] distance = new long[n - 1];
        long[] cost = new long[n - 1];
        
        String[] distanceInput = br.readLine().split(" ");
        String[] costInput = br.readLine().split(" ");

        for(int i = 0; i < n - 1; i++){
            distance[i] = Long.parseLong(distanceInput[i]);
            cost[i] = Long.parseLong(costInput[i]);
        }
        int idx = 0;
        long answer = 0;
        long minCost = cost[0];
        while(idx < n - 1){
            if(minCost > cost[idx]){
                 minCost = cost[idx];            
            }
            answer += minCost * distance[idx++];
        }
        System.out.println(answer);
    }
}