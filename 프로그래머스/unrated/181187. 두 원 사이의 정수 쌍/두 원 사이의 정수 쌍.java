class Solution {
    public long solution(int r1, int r2) {
       
        long answer = 0;
        
        for(long i = 1L; i <= r2; i++){//r2가 되었을 때는 두 수 모두 0이기 때문에 무의미하지만, +1이 되어 값정산
            //newr1의 밖을 탐색하는 것이기 때문에 ceil
            int newr1 = (int)Math.ceil(Math.sqrt((long)r1*r1-i*i)); //피타고라스정리를 통한 다른 변 길이 구하기.
            //r2원의 내부를 탐색하는 것이기 때문에 floor
            int newr2 = (int)Math.floor(Math.sqrt((long)r2*r2-i*i)); //음수의 sqrt는 0.
            answer += newr2-newr1+1;
        }

           return answer*4;
    }
}