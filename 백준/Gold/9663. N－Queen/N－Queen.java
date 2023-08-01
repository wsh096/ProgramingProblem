import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main{
    static int cnt, N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        char[][] board =new char[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = '.';
            }
        }
        backtrack(board, 0);
        System.out.println(cnt);
    }
    private static void backtrack(char[][] board, int row){
        if(row == N){
            cnt++;
            return;
        }
        for(int col = 0; col < N; col++){
            if(isValid(board, row, col)){
                board[row][col] = 'Q';
                backtrack(board, row + 1);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isValid(char[][] board, int row, int col){
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
            if(col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q'){
                return false;
            }
            if(col + (row - i) < N && board[i][col + (row - i)] == 'Q'){
                return false;
            }
        }
        return true;
    }
}