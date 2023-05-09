//배열 맨 뒤에 추가
//문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정
//set을 사용할 수 없음.(무작위라)TreeSet역시 사용할 수 없음.//최악 100,000번 연산 + 9999번
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            if(!list.contains(arr[i])) list.add(arr[i]);
        
        for(int i = 0; i < k; i++)
         answer[i] = i >= list.size() ? -1 : list.get(i);
            
        return answer;
    }
}