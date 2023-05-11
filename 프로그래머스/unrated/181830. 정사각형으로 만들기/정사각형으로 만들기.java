//1. 기본 풀이.
class Solution {
    public int[][] solution(int[][] arr) {
        //1. N 찾기. 
        int N = arr.length;
        for(int i = 0; i < arr.length; i++){
            N = Math.max(arr[i].length,N);
        }
        int[][] answer = new int[N][N];
          //  나머지는 범위 내인 경우만 값 받기
        for(int i = 0; i < N; i++){
            if(i >= arr.length) break;
            for(int j = 0; j < N; j++){
                if(j >= arr[i].length) break;
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
