import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        if(N >= 2){
            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;
            for(int i = 0; i < N; i++){
                String[] input = br.readLine().split(" ");
                minX = Math.min(minX, Integer.parseInt(input[0]));
                maxX = Math.max(maxX, Integer.parseInt(input[0]));
                minY = Math.min(minY, Integer.parseInt(input[1]));
                maxY = Math.max(maxY, Integer.parseInt(input[1]));
            }
            answer = (maxX-minX)*(maxY-minY);
        }
        System.out.println(answer);
    }
}