
//1. 초급 단순하게 찾기.
// class Solution {
//     public int solution(int[] num_list) {
//         int answer = 0;
//         for(int i = 0; i < num_list.length; i++){
//             if(answer > num_list[i]){
//                 answer = i;
//                 break;
//             }
//         }
//         if(answer == 0) return -1;
//         return answer;
//     }
// }

//2. 스트림을 통한 작성.
//findFirst를 통한 탐색이 되지 않으면 -1을 반환
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list) {
        return IntStream.range(0,num_list.length).filter(i-> num_list[i] < 0).findFirst().orElse(-1);
    }
}