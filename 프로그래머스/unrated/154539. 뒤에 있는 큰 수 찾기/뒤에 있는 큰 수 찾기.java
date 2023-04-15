import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i >= 0 ; i--){
            
            while(!stack.isEmpty() && numbers[i] >= numbers[stack.peek()]){//같은 값 역시 빼줘야 합니다.
                stack.pop();//스택의 최댓값을 갱신해 줍니다.
            }
            answer[i] = stack.isEmpty() ? -1 : numbers[stack.peek()];
            //stack이 비어있다면 -1을 (마지막 숫자는 무조건 -1이 되는 경우)
            //stack이 비어있지 않다는 건 numbers[i] < numbers[stack.peek()]이 더 큰 값임을 의미합니다.
            stack.push(i);//stack에 인덱스를 넣어 관리해줍니다.
        }//위와 같은 과정을 거치면 O(N) 입니다.
        return answer;
    }
}


