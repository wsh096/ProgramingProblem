//1. 스트림 풀이(느려서, 스트림 먼저 쓰는 걿로 바꿈)

// import java.util.stream.IntStream;
// class Solution {
//     public int[] solution(int[] num_list, int n) {
//      return IntStream.iterate(0,i -> i+n).limit((num_list.length + n -1)/n).map(i->num_list[i]).toArray();
//     }
// }

//2. 일반 풀이

import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i += n){
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}