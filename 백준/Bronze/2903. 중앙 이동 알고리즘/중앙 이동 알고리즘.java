import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int)Math.pow(((int)Math.pow(2,Integer.parseInt(br.readLine()))+1), 2));
    }
}