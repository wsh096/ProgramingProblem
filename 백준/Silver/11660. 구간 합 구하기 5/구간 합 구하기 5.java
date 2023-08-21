import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    
    private static StringTokenizer makeToken(String input) {
        return new StringTokenizer(input);
    }
    
    private static int makeInt(String input){
        return Integer.parseInt(input);
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = makeToken(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = makeInt(st.nextToken());
        int m = makeInt(st.nextToken());
        int[][] board = new int[n + 1][n + 1];
        int[][] sum = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            st = makeToken(br.readLine());
            for(int j = 1; j <= n; j++){
                board[i][j] = makeInt(st.nextToken());
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + board[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            st = makeToken(br.readLine());
            int x1 = makeInt(st.nextToken());
            int y1 = makeInt(st.nextToken());
            int x2 = makeInt(st.nextToken());
            int y2 = makeInt(st.nextToken());
            sb.append(sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] +sum[x1 - 1][y1 - 1]).append("\n");
        }
        System.out.println(sb);
    }
}