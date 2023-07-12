import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        
        System.out.println(A*B/gcd(A,B));
    }
    private static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a % b);
    }
}