import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        int nums = 1;
        int de = 1;
        for(int i = N; i >= N - R + 1; i--){
            nums *= i;
            de *= N+1-i;
        }
        System.out.println(nums/de);
        br.close();
    }
}