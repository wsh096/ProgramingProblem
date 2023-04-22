import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 1;
            int temp = a % 10;

            // 주기를 찾는다
            while (b > 0) {
                if (b % 2 == 1) {
                    result = (result * temp) % 10;
                }
                temp = (temp * temp) % 10;
                b /= 2;
            }

            // 주기에 맞춰서 결과 출력
            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }

        sc.close();
    }
}