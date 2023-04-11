import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int sum = sc.nextInt();
    int T = sc.nextInt();
    while(T-->0){
        int price = sc.nextInt();
        int ea = sc.nextInt();
        sum-=price*ea;
        if(sum < 0) break;
    }    
    if(sum != 0)    
    System.out.println("No");
    else    
    System.out.println("Yes");
    }
}
