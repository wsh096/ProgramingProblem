import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main{
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    int c = Integer.parseInt(input[2]);
    int d = Integer.parseInt(input[3]);
    int e = Integer.parseInt(input[4]);
    int f = Integer.parseInt(input[5]);
    
    int x = (c*e - b*f) /(a*e - b*d);
    int y = (a*f - c*d) / (a*e - b*d);

    System.out.println(x + " " + y);
    }
}