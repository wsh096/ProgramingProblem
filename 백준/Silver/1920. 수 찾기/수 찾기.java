import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열 A 크기

        int[] A = new int[N]; // 배열 A
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A); // 이분 탐색 위해 배열 A 정렬

        int M = sc.nextInt(); // 찾을 수 개수
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt(); // 찾을 수
            int index = Arrays.binarySearch(A, num); // 이분 탐색

            if (index < 0) { // 수가 배열 A에 없는 경우
                System.out.println(0);
            } else { // 수가 배열 A에 있는 경우
                System.out.println(1);
            }
        }
    }
}