import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] distance = new int[n - 1];
        int[] cost = new int[n - 1];
        
        String[] distanceInput = br.readLine().split(" ");
        String[] costInput = br.readLine().split(" ");
        
        int totalDistance = 0;
        int minCost = Integer.MAX_VALUE;
        
        for(int i = 0; i < n - 1; i++){
            int a = Integer.parseInt(distanceInput[i]);
            int b = Integer.parseInt(costInput[i]);
            totalDistance += a;
            distance[i] = a;
            cost[i] = b;
            minCost = minCost > b ? b : minCost;
        }
        int idx = 0;
        int answer = 0;
        while(idx < n - 1){
            if(minCost == cost[idx]){
                answer += totalDistance * minCost;
                break;
            }else{
                answer += cost[idx] * distance[idx];
                totalDistance -= distance[idx];
                idx++;
            }
        }
        System.out.println(answer);
    }
}