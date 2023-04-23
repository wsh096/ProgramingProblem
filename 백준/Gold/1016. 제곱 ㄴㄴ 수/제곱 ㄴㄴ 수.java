import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        // min~ max까지의 숫자 중 제곱수 아닌 수
        boolean[] noSquare = new boolean[(int) (max - min + 1)]; 
        int cnt = 0;

        for (long i = 2; i * i <= max; i++) {
            // min 이상 i의 제곱수 중 가장 작은 수
            long start = (min / (i * i)) * (i * i); 
            if (start < min) start += i * i;
            for (long j = start; j <= max; j += i * i) {
                noSquare[(int) (j - min)] = true;
            }
        }

        // noSquare 에서 false(제곱수)인 수 카운트
        for (int i = 0; i < noSquare.length; i++) {
            if (!noSquare[i]) cnt++;
        }
        System.out.println(cnt);
    }
}