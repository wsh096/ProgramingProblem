import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int x =sc.nextInt();
    int y =sc.nextInt();
        int side = x > 0 && y > 0 ? 1 : 
                   x < 0 && y > 0 ? 2 : 
                   x < 0 && y < 0 ? 3 :
                   x > 0 && y < 0 ? 4 : 0; 
    System.out.println(side);
    }
}
