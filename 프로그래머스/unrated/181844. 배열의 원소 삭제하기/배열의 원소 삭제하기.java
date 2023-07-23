import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
       Set<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        for(int i : delete_list) if(set.contains(i)) set.remove(i);
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int i = 0; i < arr.length; i++)
            if(set.contains(arr[i])) answer[idx++] = arr[i];
        return answer;
    }
}