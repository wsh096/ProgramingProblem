// class Solution {
//     public String solution(int[] food) {
//         String answer = "";
//         StringBuffer sb = new StringBuffer("0");
//         int tmp = 0;
//         for(int i = food.length-1;i>0;i--){
//             if(food[i]%2==1){
//                 tmp = food[i]-1;
//                 for(int j = 0; j < tmp/2; j++){
//                     sb.insert(0,i);
//                     sb.append(i);
//                 }
//             }else{
//                 tmp = food[i];
//                 for(int j = 0; j < tmp/2; j++){
//                     sb.insert(0,i);
//                     sb.append(i);
//                 }
//             }
//         }
//         return sb.substring(0);
//     }
// }

// class Solution {
//     public String solution(int[] food) {
//         StringBuffer answer = new StringBuffer("0");

//         for (int i = food.length - 1; i > 0; i--) {
//             for (int j = 0; j < food[i] / 2; j++) {
//                 answer.insert(0,i);
//                 answer.append(i);
//             }
//         }

//         return answer.substring(0);
//     }
// }

import java.util.*;

class Solution {
    public String solution(int[] food) {
        // 결과값이 대칭적인 구조로 이뤄져서 Deque를 활용
        Deque<Integer> deque = new ArrayDeque<>();
        
        // 각 원소값의 절반만큼 반복해서 그 원소의 인덱스를 Deque의 앞,뒤에 추가
        for (int i = food.length - 1; i > 0 ; i--) {
            for (int j = 1; j <= food[i] / 2; j++) {
                deque.addFirst(i);
                deque.addLast(i);
            }                       
        }
        
        int[] repFood = new int[deque.size()+1];
        
        // Deque에 저장된 값들을 출력을 위한 배열에 옮기며 중간에 0을 추가
        for (int i = 0; i < repFood.length; i++) {
            if (i < repFood.length / 2) repFood[i] = deque.poll();
            else if (i == repFood.length / 2) repFood[i] = 0;
            else repFood[i] = deque.poll();
        }        
        
        String answer = "";
        
        // 정수형 배열의 원소들을 문자열로 형변환해서 리턴값에 저장
        for (int item: repFood) answer += String.valueOf(item);
        
        return answer;
    }
}