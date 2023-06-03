import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int T = Integer.parseInt(br.readLine());
 
            String[] a = br.readLine().split(" ");
            int[] nums1 = new int[T];
            for(int i = 0; i < T; i++) nums1[i] = Integer.parseInt(a[i]);
            String[] b = br.readLine().split(" ");
            int[] nums2 = new int[T];
            for(int i = 0; i < T; i++) nums2[i] = Integer.parseInt(b[i]);
        Arrays.sort(nums1); Arrays.sort(nums2);
        for(int i = 0; i < T; i++){
            sum += nums1[i]*nums2[T-1-i];
        }
        System.out.println(sum);
        br.close();
    }
}