import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] type : clothes) map.put(type[1], map.getOrDefault(type[1], 1) + 1);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            answer *= entry.getValue();
        }
        return answer-1;
    }
}