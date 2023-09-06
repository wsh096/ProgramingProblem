import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int[] houses = new int[N];

        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(houses);
        System.out.println(binarySearch(houses, N, C)); 
    }
    private static int binarySearch(int[] houses, int N, int C){
        int left = 1;
        int right = houses[N - 1] - houses[0];
        int maxDistance = 0;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            int installed = 1;
            int prevHouses = houses[0];
            
            for(int i = 1; i < N; i++){
                if(houses[i] - prevHouses >= mid){
                    installed++;
                    prevHouses = houses[i];
                }
            }
            if(installed >= C){
                maxDistance = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return maxDistance;
    }
}