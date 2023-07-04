import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int [] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(input[0]==0 && input[1]==0 && input[2]==0) break;
            Arrays.sort(input);
            if(input[0]+input[1]<=input[2]){
                sb.append("Invalid\n");
            }else if(input[0]==input[2]){
                sb.append("Equilateral\n");
            }else if(input[0]==input[1] || input[1]==input[2]){
                sb.append("Isosceles\n");
            }else{
                sb.append("Scalene\n");
            }
        }
        System.out.println(sb);
    }
}