import java.util.Arrays;
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        int answer = 0;
        int left = 1;
        int right = distance;
        while(left<=right){
            int mid = left + (right-left)/2;
            int cnt = 0;//n만큼의 바위가 제거되었는지를 확인할 변수
            int prev = 0;//거리를 재기 위한 변수
            for(int i = 0; i < rocks.length; i++){
                if(rocks[i]-prev < mid) cnt++;//빠진 돌
                else prev = rocks[i];
                if(cnt>n) break;    
            }
            if(distance - prev < mid) cnt++;//마지막 목적지 비교
            
            if(cnt<=n){
                answer=Math.max(answer, mid);
                left = mid + 1;
            }else right = mid - 1;
 
        }
        return answer;
    }
}