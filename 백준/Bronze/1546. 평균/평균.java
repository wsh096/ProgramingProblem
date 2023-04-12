import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] A = new double[N];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < input.length;i++)
            A[i] = Double.parseDouble(input[i]);
        Arrays.sort(A);
        double avg = 0;
        for(int i = 0; i < A.length; i++){
            A[i]=A[i]/A[N-1]*100;
            avg+=A[i];
        }
        System.out.println(avg/N);
        br.close();
    }
}