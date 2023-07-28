import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
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
        int[] arr = new int[num];
		String[] input = br.readLine().split(" ");
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        
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
        int t = before;
        
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
	
                for(int k = before; k <= after; k++){
                    count++;
                    if(count == K){
                        A[k] = temp[k];
                        result = temp[k];
                        break;
                    }
                    A[k] = temp[k];
                }
    }
}