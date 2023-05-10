import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    long sum = 0;
        for(int i = 0; i < 5; i++){
            long A = Long.parseLong(input[i]);
            sum += (A * A);
        }    
        System.out.println(sum % 10);
    }
} 
        