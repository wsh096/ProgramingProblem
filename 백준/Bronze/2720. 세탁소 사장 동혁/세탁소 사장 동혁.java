import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [] arr = {25,10,5,1};
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N; i++){
            int A = Integer.parseInt(br.readLine());
            while(A > 0){
                for(int j = 0; j < 4; j++){
                    int a = 0;
                    if(A/arr[j] > 0){
                        a = A/arr[j];
                        A-=arr[j]*a;
                    }
                    sb.append(a);
                    if(j < 3){
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}