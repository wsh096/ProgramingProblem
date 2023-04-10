import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();//100,000번
        Arrays.sort(A);//(최선 NlogN, 최악 N^2)퀵sort 1,600,000 or 10^10
        int M = sc.nextInt();//찾을 수 개수
        for(int i = 0; i < M; i++){
            int target = sc.nextInt();
            //int FINDIDX = Arrays.binarySearch(A,target);
            //if(FINDIDX < 0)
            //System.out.println(0);
            //else{
            //System.out.println(1);   
            //}
            int min = 0;
            int max = N-1;
            int CHECK = 0;
            while(min <= max){
            int mid = min +(max-min)/2;
                if(A[mid] == target){
                    CHECK = 1;
                    break;//이미 mid를 봤기 때문에 볼 필요 없음
                }else if(A[mid] < target){//작으면!
                    min = mid + 1;
                }else
                    max = mid -1;//값이 큰 경우 오른쪽은 더 탐색할 필요 없음 
                }
              System.out.println(CHECK); 
            }
        }
    }
