//1. 기본 풀이.
// class Solution {
//     public int solution(int[] arr, int idx) {
//         for(int i = idx; i < arr.length; i++){
//             if(arr[i] == 1) return i;
//         }
//         return -1;
//     }
// }

//2.스트림 풀이
import java.util.stream.IntStream;
class Solution{
    public int solution(int[] arr, int idx){
        return IntStream.range(idx,arr.length).filter(i-> arr[i] == 1).findFirst().orElse(-1);
    }
}