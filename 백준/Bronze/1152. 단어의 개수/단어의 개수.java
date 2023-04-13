import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().trim();  //아무것도 없는 엣지케이스의 처리**
    int answer = s.isEmpty() ? 0 : s.split(" ").length;
    System.out.println(answer);
    }
}
