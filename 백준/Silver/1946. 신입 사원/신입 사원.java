import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
            while(N-- > 0){
            int T = Integer.parseInt(br.readLine());
            int[][] grade = new int[T][];
            for(int i = 0; i < T; i++){
                String[] input = br.readLine().split(" ");
                grade[i] = new int[] {Integer.parseInt(input[0]),Integer.parseInt(input[1])};
            }
            Arrays.sort(grade, (arr1, arr2) -> arr1[0]-arr2[0]);
            int answer = 1;
            int idx = 0;
            for(int i = 1; i < T && idx < T; i++){
                int[] cur = grade[idx];
                if(cur[0] < grade[i][0] && cur[1] < grade[i][1]) continue;
                idx = i; answer++;
            }
            System.out.println(answer);
        }
    }
}