import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(LocalDate.of(2007, Integer.parseInt(input[0]), Integer.parseInt(input[1])).getDayOfWeek().toString().substring(0,3));
    }
}