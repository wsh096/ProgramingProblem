class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int maxNum = n * (n + 1) / 2; // 최댓값
        int[] answer = new int[maxNum];
        
        int x = -1, y = 0; // 초기 위치
        int num = 1; // 채워질 수
        
        // 삼각형을 아래, 오른쪽, 위쪽 순서로 반복하면서 숫자를 채움
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // 아래로 이동
                if (i % 3 == 0) { // 아래로 이동
                    x++;
                } else if (i % 3 == 1) { // 오른쪽으로 이동
                    y++;
                } else if (i % 3 == 2) { // 위로 이동
                    x--;
                    y--;
                }
                triangle[x][y] = num++;
            }
        }
        
        //answer
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = triangle[i][j];
            }
        }
        
        return answer;
    }
}
