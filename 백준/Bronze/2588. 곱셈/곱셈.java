import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num2;
        while(num3 > 0){
        int tmp = num3%10;   
        System.out.println(num1*tmp);
        num3/=10;
        }
        System.out.println(num1*num2);
    }
}

