// 각각의 변하지 않는 최대치에서 멈추면 됨. 
class Solution {
    public int solution(int[] arr) {
  //50 미만의 짝수, 50 초과의 홀수
    int answer = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            int cnt = 0;
            while(arr[i] >= 50 && arr[i] % 2 ==0 || arr[i] < 50 && arr[i] % 2 == 1){
                if(arr[i] % 2 ==0){
                    arr[i] /= 2;
                }else{
                    arr[i] = arr[i] * 2 + 1;
                }
                cnt++;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
}