import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    static char[][] map, black, white;
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new char[N][];
        for(int i = 0; i < N; i++){
            map[i] = br.readLine().toCharArray();
        }
        
        StringBuilder blackFirst = new StringBuilder();
        StringBuilder whiteFirst = new StringBuilder();
        
        for(int i = 0; i < M; i++){
            if(i%2==0) blackFirst.append("B");
            else blackFirst.append("W");
        }
        
         for(int i = 0; i < M; i++){
            if(i%2==0) whiteFirst.append("W");
            else whiteFirst.append("B");
        }
        
        char[] bF = blackFirst.toString().toCharArray();
        char[] wF = whiteFirst.toString().toCharArray();
        
        black = new char[N][];
        for(int i = 0; i < N; i++){
            if(i % 2==0) black[i] = bF;
            else black[i] = wF;
        }
        
        white = new char[N][];
        for(int i = 0; i < N; i++){
            if(i % 2==0) white[i] = wF;
            else white[i] = bF;
        }
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int case1 = counter(i, j, black);
                int case2 = counter(i, j, white);
                int min = Math.min(case1, case2);
                minCount = Math.min(min, minCount);
            }
        }
        System.out.println(minCount);
    }
    
    private static int counter(int startX, int startY, char[][] pattern){
        int cnt = 0;
        for(int i = startX; i < startX + 8; i++){
            for(int j = startY; j < startY + 8; j++){
                if(map[i][j] != pattern[i-startX][j-startY]) cnt++;
            }
        }
        return cnt;
    }
}