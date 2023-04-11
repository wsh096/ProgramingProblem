import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while((input = br.readLine()) != null){
            String[] nums = input.split(" ");
            int A = Integer.parseInt(nums[0]);
            int B = Integer.parseInt(nums[1]);
            bw.write((A+B)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}