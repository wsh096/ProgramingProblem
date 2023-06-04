import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger1 = Integer.parseInt(br.readLine());
        int burger2 = Integer.parseInt(br.readLine());
        int burger3 = Integer.parseInt(br.readLine());
        
        int burger = Math.min(burger1, Math.min(burger2, burger3));

        int cock = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());
        
        int drink = Math.min(cock, cider);

        System.out.println(burger+drink-50);
    }
}