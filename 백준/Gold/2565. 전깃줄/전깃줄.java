import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        int[][] lines = new int[n][2];
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            lines[i][0] = Integer.parseInt(input[0]);
            lines[i][1] = Integer.parseInt(input[1]);
        }
        timSort(lines, n);
        int max = 0;
        for(int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(lines[i][1] > lines[j][1] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(n - max);
    }
    static final int RUN = 32;
    
    public static void insertionSort(int[][] arr, int left, int right){
        for(int i = left + 1; i <= right; i++){
            int[] temp = arr[i];
            int j = i - 1;
            while(j >= left && arr[j][0] > temp[0]){
                arr[j + 1] = arr[j];
                j--;
            } 
            arr[j + 1] = temp;
        }
    }
    public static void merge(int[][] arr, int l, int m, int r){
        int len1 = m - l + 1, len2 = r - m;
        int[][] left = new int[len1][2];
        int[][] right = new int[len2][2];
        for(int x = 0; x < len1; x++){
            left[x] = arr[l + x];
        }
        for(int x = 0; x < len2; x++){
            right[x] = arr[m + 1 + x];
        }
        int i = 0, j = 0, k = l;
        while(i < len1 && j < len2){
            if(left[i][0] <= right[j][0]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
         }
            k++;
        }
        while(i < len1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j < len2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    public static void timSort(int[][] arr, int n){
        for(int i = 0; i < n; i += RUN){
            insertionSort(arr, i, Math.min((i + RUN - 1),(n - 1)));
        }
        
        for(int size = RUN; size < n; size = 2 * size){
            for(int left = 0; left < n; left += 2 * size){
                int mid = Math.min((left + size - 1), (n - 1));
                int right = Math.min((left + 2 * size - 1), (n - 1));
                merge(arr, left, mid, right);
            }
        }
    }
}