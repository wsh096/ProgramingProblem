import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int start = 1;
        int end = k;
        int answer = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            long cnt = 0;
            
            for(int i = 1; i <= n; i++){
                cnt += Math.min(mid/i,n);
               if(cnt >= k)break;
            }
            if(cnt < k) start = mid + 1;
            else{
                answer = mid;
                end = mid -1;
            }
        }
        System.out.println(answer);
    }
}