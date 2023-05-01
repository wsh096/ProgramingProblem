//1. 일반 풀이

// class Solution {
//     public int solution(int[] numbers, int n) {
//         int answer = 0;
//         for(int num : numbers){
//             answer+=num;
//             if(answer > n) break;
//             }
//         return answer;
//     }
// }

//2. 스트림 풀이
//orElse(0);은 최종연산에 해당하며
//이외에도 예외는 사실 없기 때문에 .getAsInt();를 사용해도 된다.
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers, int n) {
    return IntStream.range(0, numbers.length).map(i -> IntStream.of(numbers).limit(i + 1).sum()).filter(sum -> sum > n).findFirst().orElse(0);
}
}