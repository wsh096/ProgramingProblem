import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger money = new BigInteger(sc.next());
        BigInteger lives = new BigInteger(sc.next());
        BigInteger share = money.divide(lives);
        BigInteger remain = money.subtract(share.multiply(lives));
        System.out.println(share);
        System.out.println(remain);
    }
}