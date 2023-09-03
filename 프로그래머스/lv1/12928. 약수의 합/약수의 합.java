class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = (int)Math.sqrt(n);
        for(int i = 1; i <= max; i++){
            if(n % i == 0){
            int temp = n / i;
            if(temp != i){
            answer += i;
            answer += n / i;
            }
            else{
                answer += i;
            }
            }
        }
        return answer;
    }
}