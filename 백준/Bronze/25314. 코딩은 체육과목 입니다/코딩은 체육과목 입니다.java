import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int repeat = N/4;
        while(repeat-->0){
            sb.append("long ");
        }
        
    System.out.println(sb.append("int"));
    }
}
