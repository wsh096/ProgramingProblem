import java.util.Arrays;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a,b) -> a[1] - b[1]); // 차량이 나간 시점 기준으로 오름차순 정렬.
        int camera = Integer.MIN_VALUE; //카메라 설치를 위한 값 갱신 초기값
        for(int[] route : routes){
            if(camera < route[0]){//시작점 보다 작으면
                answer++;//값을 더해주고
                camera = route[1];//나가는 지점으로 값을 갱신
            }
        }
        return answer;
    }
}