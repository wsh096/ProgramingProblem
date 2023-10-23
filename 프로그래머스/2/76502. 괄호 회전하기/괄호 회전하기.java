import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.List;
import java.util.LinkedList;
class Solution {
    private boolean check(List<Character> str){
        Map<Character,Character> map = new HashMap<>(){
            {
                put('[',']');
                put('{','}');
                put('(',')');
            }
        };
        
        Stack<Character> stack  = new Stack<>();
        for(int i = 0; i < str.size(); i++){
                char c = str.get(i);
                if(map.containsKey(c)){//여는 괄호일 때
                    stack.push(map.get(c));
                }else{//닫는 괄호일 때
                  if(stack.isEmpty()) return false;//처음부터 닫는 괄호라는 뜻
                  if(stack.pop() != c) return false; 
                    //if를 먼저 실행하므로 size가 바뀜. 
                    //닫는 괄호의 짝이 맞는 경우여서 사이즈만 줄어듬. 
                }
            }
        return stack.size() == 0;
    }
    
    public int solution(String s) {
        int answer = 0;
        List<Character> li = new LinkedList<>();
        for(char i: s.toCharArray()){
            li.add(i);
        }
        for(int i = 0; i < s.length();i++){
            if(check(li)){
                answer++;
            }
            char c = li.remove(0);
            li.add(c);
        }
        return answer;
    }
}