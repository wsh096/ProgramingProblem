import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int mod = 1_000_000;
        int p = mod/10*15;
        int [] fib = new int[p];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < p; i++){
            fib[i] = fib[i-1] + fib[i-2];
            fib[i] %= mod;
        }
        System.out.println(fib[(int)(n % p)]);//피사노 주기. 피보나치 수 구한 나머지의 주기.
        sc.close();
    }
}