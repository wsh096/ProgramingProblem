import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dwarf = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarf[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[9];
        int[] out = new int[7];
        recursive(dwarf, visited, 0, 0, out);
    }

    private static void recursive(int[] dwarf, boolean[] visited, int cnt, int sum, int[] out) {
        if (sum > 100) { // 키의 합이 100을 초과한 경우, 함수 종료
            return;
        }
        if (cnt == 7 && sum == 100) { // 일곱 명을 찾은 경우, 선택된 인덱스를 저장하고 출력
            Arrays.sort(out);
            for (int o : out) {
                System.out.println(o);
            }
            System.exit(0); // 프로그램 종료
        }
        if (cnt > 6) { // 키의 합이 100을 초과한 경우, 함수 종료
            return;
        }
        for (int i = 0; i < dwarf.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[cnt] = dwarf[i];
                recursive(dwarf, visited, cnt + 1, sum + dwarf[i], out);
                visited[i] = false;
            }
        }
    }
}