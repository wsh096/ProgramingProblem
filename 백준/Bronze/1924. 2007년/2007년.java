import java.util.Date;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Date x = new Date();
        x.setYear(107); x.setMonth(Integer.parseInt(input[0])-1);
        x.setDate(Integer.parseInt(input[1]));
        System.out.println(x.toString().substring(0,3).toUpperCase());
    }
}