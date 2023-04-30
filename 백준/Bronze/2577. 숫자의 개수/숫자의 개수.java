import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        String num = String.valueOf(A*B*C);
        int[] numArr = new int[10];
        for(int i = 0; i < num.length();i++){
            numArr[num.charAt(i)-'0']++;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(numArr[i]);
        }
    }
}