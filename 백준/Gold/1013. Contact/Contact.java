import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String pattern = "(100+1+|01)+"; // 정규 표현식 패턴
        Pattern p = Pattern.compile(pattern);

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            Matcher m = p.matcher(s);

            if (m.matches()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}