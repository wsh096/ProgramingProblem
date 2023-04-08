class Solution {
    public int[] solution(int[] sequence, int k) {
        //투포인터
        int p1 = 0, p2 = 0;
        int[] answer = {p1, p2};
        int sum = sequence[p1];
        if(sum == k) return answer;
        
        while(p1 < sequence.length-1 && p2 < sequence.length-1){
            while(p2 <= sequence.length-1 && sum < k)
                sum+=sequence[++p2];
            while(p1 <= sequence.length-1 && sum > k)
                sum-=sequence[p1++];
         
            while(sum == k){
                if(answer[1] == 0)//최초 갱신
                    answer = new int[] {p1,p2};
                else{//길이가 짧을 때만 갱신
                   if(answer[1]-answer[0] > p2 - p1)
                       answer = new int[] {p1, p2};
                }
                sum-=sequence[p1++];//길이 조정해서 while 탈출, 계속 탐색
            }
            if(answer[1] != 0 && answer[1]-answer[0] == 0) return answer;//최적화//가장 짧은 순간
        }
        
        return answer;
    }
}

