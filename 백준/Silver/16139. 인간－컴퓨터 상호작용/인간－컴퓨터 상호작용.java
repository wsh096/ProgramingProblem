import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        char[] origin = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            char c = input[0].charAt(0);
            int l = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);
            int temp = 0;
            for(int j = l; j <= r; j++) if(origin[j] == c) temp++;
            answer.append(temp).append("\n");
        }
        System.out.println(answer);
    }
}