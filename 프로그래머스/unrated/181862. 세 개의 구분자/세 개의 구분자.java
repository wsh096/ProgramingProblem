import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]+");
        List<String> list = new ArrayList<>();
        for(String str : answer) if(!str.isEmpty()) list.add(str);
        return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(String[]::new);
    }
}