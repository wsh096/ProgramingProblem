//1. 이름값 대로 stk를 활용. deque를 활용하면 더 편하게 마지막 정답을 도출할 수 있음.

// import java.util.Stack;
// class Solution {
//     public int[] solution(int[] arr) {
//         Stack<Integer> stk = new Stack<>();
//         int idx = 0;
//         while(idx < arr.length){
//             if(stk.isEmpty()){
//                 stk.push(arr[idx]);
//             }else if(!stk.isEmpty() && stk.peek() == arr[idx]){
//                 stk.pop();
//             }else if(!stk.isEmpty() && stk.peek() != arr[idx]){
//                 stk.push(arr[idx]);
//             }
//              idx++;
//         }
//         if(stk.isEmpty()) return new int[]{-1};
//         int[] answer = new int[stk.size()];
        
//         for(int i = answer.length-1; i>=0;i--){
//             answer[i] = stk.pop();   
//         }
//         return answer;
//     }
// }

//2. deque && 스트림을 이용한 식 정리.
//1. 번의 경우 문제 지문 그대로 구현.
//2. 의 경우 삭제와 추가 부분으로 나누어 구현.
//어차피 순서대로 arr을 탐색하기 때문에 for문 활용

import java.util.ArrayDeque;
import java.util.Deque;

class Solution{
    public int[] solution(int[] arr){
        Deque<Integer> deque = new ArrayDeque<>();
        for(int num : arr){
            if(!deque.isEmpty() && deque.peekLast() == num){
                deque.pollLast();
            }else{
                deque.offerLast(num);
            }
        }
        return deque.isEmpty() ? new int[] {-1} : deque.stream().mapToInt(Integer::intValue).toArray();
        
    }
}