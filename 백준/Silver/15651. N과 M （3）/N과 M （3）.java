import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
     static int N, M;
    static boolean[] visited;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        selected = new int[M];
        
        findSequence(1, 0);
        
        System.out.println(sb);
    }
    
    private static void findSequence(int start, int depth){
        if(depth == M) {
            for(int num : selected){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i = start; i <= N; i++){
                selected[depth] = i;
                findSequence(1, depth + 1);
            }
        }
    }
