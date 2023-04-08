import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        int N = players.length;
        String[] answer = new String[N];
        Map<Integer, String> treemap = new TreeMap<>();//정렬된 값
        Map<String, Integer> hashmap = new HashMap<>();//idx 정보 찾기
        for(int i = 0; i < N; i++){
            treemap.put(i,players[i]);
            hashmap.put(players[i],i);
        }
        for(String calling : callings){
            int idx = hashmap.get(calling);//앞서 나갈 사람의 이름이 담긴 idx(idx-1)로 나아감
            String backplayer = treemap.get(idx-1);//뒤쳐진 사람과 앞서 나간 사람 Swap;
            
            //hashmapSwap;
            hashmap.put(calling,idx-1);//앞서 가는 자.
            hashmap.put(backplayer,idx);//뒤로 간 자.
            //treemapSwap;
            treemap.put(idx-1,calling);//앞서는 사람 순으로 TreeMap에서 자동 정렬
            treemap.put(idx,backplayer);//
        }
        int j = 0;
        for(String value : treemap.values()){
            answer[j++] = value;
        }
        return answer;
    }
}