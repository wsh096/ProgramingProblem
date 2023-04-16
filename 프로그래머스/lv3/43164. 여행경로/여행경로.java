import java.util.*;

class Solution {
    List<String> answer = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
    int size;
    
    public String[] solution(String[][] tickets) {
        size = tickets.length + 1;
        for (String[] ticket : tickets) {
            String from = ticket[0];
            String to = ticket[1];
            if (!map.containsKey(from)) {
                map.put(from, new ArrayList<>());
            }
            map.get(from).add(to);
        }
        for (List<String> list : map.values()) {
            Collections.sort(list);
        }
        answer.add("ICN");
        dfs("ICN");
        return answer.toArray(new String[0]);
    }
    
    private boolean dfs(String location) {
        if (answer.size() == size) {
            return true;
        }
        if (!map.containsKey(location) || map.get(location).isEmpty()) {
            return false;
        }
        List<String> list = map.get(location);
        for (int i = 0; i < list.size(); i++) {
            String next = list.remove(i);
            answer.add(next);
            if (dfs(next)) {
                return true;
            }
            answer.remove(answer.size() - 1);
            list.add(i, next);
        }
        return false;
    }
}