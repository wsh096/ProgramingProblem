import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num) {
        List<Integer> answer = Arrays.stream(num).boxed().collect(Collectors.toList()); 
        if(answer.get(num.length - 1) > answer.get(num.length - 2 )){
            answer.add(answer.get(num.length - 1) - answer.get(num.length - 2));
        }else{
            answer.add(num[num.length-1] * 2);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}