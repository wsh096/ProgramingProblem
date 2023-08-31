import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int idx = 0;
        Map<String, Integer> user = new HashMap<>();
        Map<String, HashSet<String>> check = new HashMap<>();
        for(String id : id_list){
            user.put(id,idx++);
            check.put(id, new HashSet<>());//good
        }
        for(String item: report){
            String[] items = item.split(" ");
            check.get(items[1]).add(items[0]);//get으로 부르는게 hashset!
        }
        for(String b : id_list){
            Set<String> hashset = check.get(b);//hashset을 가져온 것. 신고당한 hashset의 집합.
            if(hashset.size()>=k){//신고한 사람들.
                for(String s:hashset){
                    answer[user.get(s)]++;
                }
            }
        }
        
        return answer;
    }
}