import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] result = new int[A];
        Set<Integer> set = new TreeSet<>();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < A; i++){
            set.add(arr[i]);
        }
        int[] temp = new int[set.size()];
        int idx = 0;
        for(int i : set){
            temp[idx++] = i;
        }
        for(int i = 0; i < A; i++){
            result[i] = Arrays.binarySearch(temp,arr[i]);
        }

       StringBuilder sb = new StringBuilder();
        for(int i : result) sb.append(i).append(" ");
       System.out.println(sb);
        
    }
}  