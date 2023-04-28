import java.util.List;
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] arr) {//while 문 기본 연습 예제 if-else
        int i = 0;
        List<Integer> stk = new LinkedList<>();
        while(i < arr.length){
            //만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }
            //stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합
            else if(stk.get(stk.size()-1) < arr[i]){
                
                stk.add(arr[i]);
                i++;
            }
            //stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거
            else {
                stk.remove(stk.size()-1);
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}