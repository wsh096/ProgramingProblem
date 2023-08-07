import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] balloons = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            balloons[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            result[i] = index + 1; // 터진 풍선의 번호 저장
            int step = balloons[index];
            balloons[index] = 0; // 풍선 터뜨리기

            if (i == N - 1) break; // 마지막 풍선일 경우 종료

            // 풍선에 적힌 값만큼 이동
            if (step > 0) {
                for (int j = 0; j < step; j++) {
                    index = (index + 1) % N;
                    if (balloons[index] == 0) j--; // 이미 터진 풍선은 빼고 이동
                }
            } else {
                for (int j = 0; j < -step; j++) {
                    index = (index - 1 + N) % N;
                    if (balloons[index] == 0) j--; // 이미 터진 풍선은 빼고 이동
                }
            }
        }

        // 터진 풍선의 번호 출력
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
