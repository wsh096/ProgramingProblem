import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     StringBuilder sb1 = new StringBuilder();
     StringBuilder sb2 = new StringBuilder();
        sb1.append(sc.next());
        sb2.append(sc.next());
        sb1 = sb1.reverse();
        sb2 = sb2.reverse();
        int A = Integer.parseInt(sb1.toString());
        int B = Integer.parseInt(sb2.toString());
        int answer = A > B ? A : B;
        System.out.println(answer);
    }
}