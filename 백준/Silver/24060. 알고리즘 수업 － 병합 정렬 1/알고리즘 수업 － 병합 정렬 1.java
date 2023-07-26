import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    static int[] temp;
    static int count = 0;
    static int K;
    static int result = -1;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        K = Integer.parseInt(st.nextToken());
        temp = new int[num];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        merge_sort(arr, 0, num - 1);
        System.out.println(result);
    }
    private static void merge_sort(int[] A, int before, int after){
        if(before < after){
            int mid = before + (after - before)/2;
            merge_sort(A, before, mid);
            merge_sort(A, mid + 1, after);
            merge(A, before, mid, after);
        }
    }
    private static void merge(int[] A, int before, int mid, int after){
        int i = before;
        int j = mid + 1;
        int t = 0;
        
        while(i <= mid && j <= after){
            if(A[i] <= A[j]){
                temp[t++] = A[i++];
            }else{
                temp[t++] = A[j++];
            }
        }
        while(i <= mid){
            temp[t++] = A[i++];
        }
        while(j <= after){
            temp[t++] = A[j++];
        }
        t = 0;
        i = before;
        
        while(i <= after){
            count++;
            if(count == K){
                result = temp[t];
                break;
            }
            A[i++] = temp[t++];
        }
    }
}