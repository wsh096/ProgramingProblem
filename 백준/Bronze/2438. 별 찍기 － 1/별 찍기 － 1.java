import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= T; i++){
            int j = 0;
            while(j++ < i)
                sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}