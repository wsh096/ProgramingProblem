
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        Map<Integer, Integer> counts = new HashMap<>();
        int answer = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int topping_i = topping[i];
            counts.put(topping_i, counts.getOrDefault(topping_i, 0) + 1);
            while (counts.size() > 2 || counts.get(topping[start]) > 1) {
                int topping_start = topping[start];
                counts.put(topping_start, counts.get(topping_start) - 1);
                if (counts.get(topping_start) == 0) {
                    counts.remove(topping_start);
                }
                start++;
            }
            if (counts.size() == 2) {
                answer += i - start + 1;
            }
        }
        return answer;
    }
}