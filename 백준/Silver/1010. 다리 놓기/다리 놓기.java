import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 서쪽에 있는 사이트의 개수
            int M = sc.nextInt(); // 동쪽에 있는 사이트의 개수

            // 조합 계산
            int result = 1;
            for (int j = 1; j <= N; j++) {
                result = result * (M - N + j) / j;
            }

            System.out.println(result);
        }
        sc.close();
    }
}