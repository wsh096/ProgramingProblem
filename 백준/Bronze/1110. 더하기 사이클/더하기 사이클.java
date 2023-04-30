import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = true;
        int a = N;
        int cycle = 0;
        while(flag){
            if(a < 10){
                a = a * 10 + a;
            }else{
                int S = a % 10;
                int F = a / 10;
                int next = (F + S) % 10;
                a = S * 10 + next;
            }
            if(a == N) flag = false;
            cycle++;
        }
        System.out.println(cycle);
    }
}