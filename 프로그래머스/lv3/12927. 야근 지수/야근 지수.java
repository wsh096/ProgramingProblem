import java.util.PriorityQueue;
import java.util.Arrays;
//import java.util.Comparator;
class Solution {
    public long solution(int n, int[] works) {
    
    if(Arrays.stream(works).sum() <= n) return 0;
    PriorityQueue<Integer> pq = 
    new PriorityQueue<>((a,b)->b-a);
    for(int i :works) pq.add(i);//최대 20,000 2*10^4번 연산
    while(n > 0){//최대 100만번 10^6번 연산
        int oneSolve = pq.poll()-1;
        if(oneSolve > 0)
            pq.offer(oneSolve);
        n--;
        }
    //최대 20,000번 연산 여기서부턴 long 형이 필요. 제곱으로 주기 때문 오버플로 방지
    long answer = 0;
    for(int i : pq) answer+=Math.pow((long)i,2);
    
        
    
    return answer;
    }
}