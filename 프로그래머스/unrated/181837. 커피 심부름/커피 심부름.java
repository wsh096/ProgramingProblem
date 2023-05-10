//1. 기본 풀이.

// class Solution {
//     public int solution(String[] order) {
//         int answer = 0;
//         for(String offer : order)
//             answer += offer.contains("cafelatte") ? 5000 : 4500;    
//         return answer;
//     }
// }

//2. 스트림 풀이.
import java.util.Arrays;
class Solution {
    public int solution(String[] order) {    
    return Arrays.stream(order).mapToInt(offer->offer.contains("cafelatte") ? 5000 : 4500).sum();
    }
}

