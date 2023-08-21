import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    
    private static StringTokenizer T(String input) {
        return new StringTokenizer(input);
    }
    
    private static int I(String input){
        return Integer.parseInt(input);
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = T(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = I(st.nextToken());
        int m = I(st.nextToken());
        
        int[][] sum = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            st = T(br.readLine());
            for(int j = 1; j <= n; j++){
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + I(st.nextToken());
            }
        }
        for(int i = 0; i < m; i++){
            st = T(br.readLine());
            int x1 = I(st.nextToken());
            int y1 = I(st.nextToken());
            int x2 = I(st.nextToken());
            int y2 = I(st.nextToken());
            sb.append(sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] +sum[x1 - 1][y1 - 1]).append("\n");
        }
        System.out.println(sb);
    }
}