import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(int[] numLog) {
         Map<Integer, Character> map = new HashMap<>();
        map.put(1,'w');
        map.put(-1,'s');
        map.put(10,'d');
        map.put(-10,'a');
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < numLog.length;i++){
            int num = numLog[i]-numLog[i-1];
            answer.append(map.get(num));
        }
        return answer.toString();
    }
}