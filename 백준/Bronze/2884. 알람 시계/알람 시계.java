import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int min = sc.nextInt();
    if(min - 45 < 0) {min+= 15;
        if(hour - 1 < 0) hour += 23;
        else hour-=1;
    }else min-=45;    
    System.out.println(hour+" "+min);
    }
}
