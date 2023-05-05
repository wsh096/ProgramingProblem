//1.일반 풀이
// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//        for(int[] query : queries){
//            for(int i = query[0]; i <= query[1]; i++) arr[i]++;
//        }
//         return arr;
//     }
// }

//2.스트림 풀이

import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {

Arrays.stream(queries).forEach(query->IntStream.rangeClosed(query[0],query[1]).forEach(i->arr[i]++));
        return arr;
    }
}