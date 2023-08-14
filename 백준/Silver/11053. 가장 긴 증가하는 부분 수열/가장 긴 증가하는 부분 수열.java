import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] LIS = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int size = 0;
        for(int i = 0; i < n; i++){
            int pos = binarySearch(LIS, size, arr[i]);
            LIS[pos] = arr[i];
            if(size == pos) size++;
        }
        System.out.println(size);
    }
    private static int binarySearch(int[] arr, int size, int target){
        int left = 0;
        int right = size - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}