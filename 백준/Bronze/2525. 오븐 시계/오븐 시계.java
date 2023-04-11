import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int min = sc.nextInt();
    int time = sc.nextInt();
    min += time;        
    int plus = min/60;
    min %= 60;
    hour += plus;
    hour %= 24;     
    System.out.println(hour +" "+min );
    }
}
