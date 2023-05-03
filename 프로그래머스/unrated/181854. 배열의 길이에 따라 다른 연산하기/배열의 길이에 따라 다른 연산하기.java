//1. 기본 풀이
// class Solution {
//     public int[] solution(int[] arr, int n) {
//         if(arr.length % 2 == 0) {
//             for(int i = 1; i < arr.length; i += 2)
//                 arr[i] += n;
//         }else{
//             for(int i = 0; i < arr.length; i += 2)
//                 arr[i] += n;
//         }
//         return arr;
//     }
// }

//2. 스트림 풀이
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length)
                        .map(i -> i % 2 == 0 && arr.length % 2 == 1 || i % 2 == 1 && arr.length % 2 == 0 ? arr[i] + n : arr[i])
                        .toArray();
    }
}