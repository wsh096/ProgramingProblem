import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(isCorrect(i)){
                answer.add(i);
            }
        }
        if(answer.isEmpty()){
            return new int[] {-1};
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    private boolean isCorrect(int num){
        String str = String.valueOf(num);
        for(char c : str.toCharArray()){
            if(c != '0' && c != '5'){
                return false;
            }
        }
        return true;
    }
}