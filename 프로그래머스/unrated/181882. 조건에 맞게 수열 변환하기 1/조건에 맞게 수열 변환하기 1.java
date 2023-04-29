//1. 문제의 단순 구현.

// class Solution {
//     public int[] solution(int[] arr) {
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] >= 50 && arr[i] % 2 == 0){
//                 arr[i]/=2;
//             }else if(arr[i] < 50 && arr[i] % 2 == 1){
//                 arr[i]*=2;
//             }
//         }
//         return arr;
//     }
// }

//2. 삼항 연산자 이거 띄어쓰기로 아래와 같이 나눠도 됩니다 :) 단순 예시 표준은 아님
// class Solution {
//     public int[] solution(int[] arr) {
//         for(int i = 0 ; i < arr.length; i++){
//             arr[i] = arr[i] >= 50 && arr[i] % 2 == 0 
//                 ? arr[i]/2 : 
//             arr[i] < 50 && arr[i] % 2 == 1 
//                 ? arr[i]*2 : arr[i];
//         }
//         return arr;
//     }
// }

//3. 위 두 번째를 스트림으로 작성.
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(x -> x >= 50 && x%2==0 ? x/2 : x <50 && x%2==1 ? x*2 :x).toArray();
    }
}