import java.util.*;
public class Main{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        //입력
        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        // 종료시간 빠른순 정렬
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int count = 1;
        int end = meetings[0][1];

        // 종료가 빠른순 선택
        for (int i = 1; i < n; i++) 
            if (end <= meetings[i][0]) {
                count++;
                end = meetings[i][1];
            }
        System.out.println(count);
    }
}