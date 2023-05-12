/**
영재가 실어야 하는 택배상자 크기 모두 같으며 1번 상자부터  n번 상자까지 번호가 증가하는 순서대로 컨테이너 벨트에 일렬로 놓여 영재에게 전달.
컨테이너 벨트에 일렬로 놓여 영재에게 전달. 
컨테이너 벨트는 한 방향으로만 진행이 가능해서 벨트에 놓인 순서대로 (1번 상자부터) 상자를 내릴 수 잇다. 하지만 컨테이너 벨트에 놓인 순서대로 택배상즈를 내려 바로 트럭에 싣게 되;면
택배 기사님이 배달하는 순서와 택배상자가 실려있는 순서가 맞지 않아 배달에 차질이 생깁니다. 따라서 택배 기사님이 미리 알려준 수넛에 맞게 영재가 탭개상자를 실어야 합니다.
*/
import java.util.Stack;
class Solution {
    public int solution(int[] order) {
        int num = 1;
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        while(num <= order.length && idx < order.length){
    
         if(order[idx] != num && stack.isEmpty())
            stack.push(num++); 
         else if(order[idx] != num && order[idx] != stack.peek())
            stack.push(num++);        
         else if(order[idx] == num){
            idx++; num++; answer++;
        }else if(!stack.isEmpty() && order[idx] == stack.peek()){
            idx++; stack.pop(); answer++;
         }
        }
        while(idx < order.length && order[idx] == stack.peek()){
            stack.pop(); answer++; idx++;
        }
        return answer;
    }
}