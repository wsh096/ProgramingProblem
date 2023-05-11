import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] table = new int[T][];
        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            int[] info = new int[] {Integer.parseInt(input[0]),Integer.parseInt(input[1])};
            table[i] = info;
        }
        int[] ranks = new int[T];
        for(int i = 0; i < T; i++){
            int rank = 1;
            for(int j = 0; j < T; j++){
                if(i == j) continue;
                if(table[i][0] < table[j][0] && table[i][1] < table[j][1]) rank++;
            }
            ranks[i] = rank;
        }
        for (int i = 0; i < T; i++) {
            System.out.print(ranks[i] + " ");
        }
    } 
}