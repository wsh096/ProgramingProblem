import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
    static int[] idx;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[9][];
        for(int i = 0; i < 9; i++){
            String[] input = br.readLine().split(" ");
            board[i] = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(max < board[i][j]){
                    max = board[i][j];
                    idx = new int[]{i+1,j+1};
                }
            }
        }
        System.out.println(max);
        System.out.println(idx[0] +" "+ idx[1]);
        
        br.close();
    }
}