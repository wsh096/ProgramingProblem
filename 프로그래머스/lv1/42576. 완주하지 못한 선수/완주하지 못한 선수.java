import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String participatePerson : participant){
            map.put(participatePerson, map.getOrDefault(participatePerson, 0) + 1);
        }
        for(String completePerson : completion){
            if(map.containsKey(completePerson)){
                map.put(completePerson, map.get(completePerson) -1);
            }
            if(map.get(completePerson) == 0){
                map.remove(completePerson);
            }
        }
        for(String temp : map.keySet()){
            return temp;
        }
        
        return "";
    }
}