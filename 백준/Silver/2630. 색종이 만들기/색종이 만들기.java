import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int[][] paper;
    static int white = 0, blue = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
    private static void divide(int x, int y, int n){
        if(check(x, y, n)){
            if(paper[x][y] == 0) {
                white++;
            }else{
                blue++;
            }
            return;
        }
        int newSize = n / 2;
        divide(x, y, newSize);
        divide(x, y + newSize, newSize);
        divide(x + newSize, y, newSize);
        divide(x + newSize, y + newSize, newSize);
    }
    private static boolean check(int x, int y, int n){
        int color = paper[x][y];
        for(int i = x; i < x + n; i++){
            for(int j = y; j < y + n; j++){
                if(paper[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}