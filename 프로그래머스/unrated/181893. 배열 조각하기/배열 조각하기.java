import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] query) {
       List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 0; i < query.length; i++){
            int idx = query[i];
            if(i % 2 == 0){
                list.subList(idx + 1,list.size()).clear();
            }else{
                list.subList(0, idx).clear();
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}