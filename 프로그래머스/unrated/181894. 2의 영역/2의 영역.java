//1. 투포인터
// import java.util.Arrays;
// class Solution {
//     public int[] solution(int[] arr) {
//         int s = 0;
//         int e = arr.length-1;
//         while(true){
//             while(s < arr.length && arr[s] != 2) s++;
//             if(s == arr.length && arr[s-1] != 2) break;
//             while(e >=s && arr[e] != 2) e--;
//             return Arrays.copyOfRange(arr, s,e+1);
//         }
              
//         return new int[] {-1};
//     }
// }

//2.스트림 풀이
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution{
    public int[] solution(int[] arr){
        return IntStream.range(0, arr.length).filter(i->arr[i] == 2).toArray()
            .length==0? new int[] {-1} : Arrays.copyOfRange(arr,IntStream.range(0, arr.length)
            .filter(i -> arr[i] == 2)
            .findFirst().getAsInt(),
            IntStream.range(0, arr.length)
            .filter(i -> arr[i] == 2)
            .reduce((first, second) -> second)
            .getAsInt() + 1);
    }
}