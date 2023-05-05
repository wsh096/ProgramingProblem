import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        boolean[] frame = new boolean[N+5];
        
        for(int i = 2; i <= N; i++){
            if(frame[i]) continue;
            if(i >= M) sb.append(i).append("\n");
            for(int j = i+i; j <= N; j += i)
                    frame[j] = true; 
        }
        
      System.out.println(sb.toString());
        
        sc.close();
    }
}