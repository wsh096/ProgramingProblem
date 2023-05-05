import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] frame = new boolean[N+1];
        frame[0] = true;
        frame[1] = true;
        for(int i = 2; i*i <= N; i++){
            if(!frame[i])
            for(int j = i*i; j <= N; j += i)
                    frame[j] = true; 
            }
        
        for(int i = M; i <= N; i++)
            if(!frame[i]) System.out.println(i);
        
        sc.close();
    }
}