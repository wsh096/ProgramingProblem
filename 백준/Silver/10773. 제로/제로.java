import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int idx = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0 && idx != 0){
                idx--;
                sum -= arr[idx];
            }else{
                arr[idx] = temp;
                sum += arr[idx++];
            }
        }
        System.out.println(sum);
    }
}