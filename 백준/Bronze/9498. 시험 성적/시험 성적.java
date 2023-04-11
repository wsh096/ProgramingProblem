import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int Grade = sc.nextInt();
    if(Grade >= 90)
    System.out.println('A');
    else if(Grade >= 80)
    System.out.println('B');
    else if(Grade >= 70)
    System.out.println('C');
    else if(Grade >= 60)
    System.out.println('D');
    else  
    System.out.println('F');
    }
}
