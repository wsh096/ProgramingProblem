import java.util.List;
import java.util.LinkedList;
class Solution {
    public int[] solution(int n) {
        if(n == 1) return new int[] {1};
        List<Integer> list = new LinkedList<>();
        list.add(n);
        while(n > 1){    
            if(n % 2 == 0) {
                n/=2;
            }else{
                n = 3 * n + 1; 
            }    
            list.add(n);
        }
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}