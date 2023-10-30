import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Assignment {
    String subject;
    int start;
    int time;

    public Assignment(String subject, int start, int time) {
        this.subject = subject;
        this.start = start;
        this.time = time;
    }
    
     public Assignment(String subject, int time) {
        this.subject = subject;
        this.time = time;
    }
}

class Solution {
    public String[] solution(String[][] plans) {
        List<Assignment> assignments = new ArrayList<>();
        for (String[] plan : plans) {
            String subject = plan[0];
            String[] hhmm = plan[1].split(":");
            int start = makeTime(hhmm);
            int time = Integer.parseInt(plan[2]);
            assignments.add(new Assignment(subject, start, time));
        }
        
        Collections.sort(assignments, (a, b) -> a.start - b.start);

        Stack<Assignment> stack = new Stack<>();
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < assignments.size(); i++) {
           if(i == assignments.size() - 1){//마지막인 경우
               answer.add(assignments.get(i).subject);
               break;
           }
            int current = assignments.get(i).start + assignments.get(i).time;
            int next = assignments.get(i + 1).start;
            int differ = next - current;
            
            if(differ < 0){//끝나지 않은 것. stack에 추가.
                stack.push(new Assignment(assignments.get(i).subject, (-1 * differ)));
            }else{//충분히 소요되는 것. 두 가지로 나뉨.
                    answer.add(assignments.get(i).subject);
                if(differ > 0){//0보다 큰 경우,
                    while(!stack.isEmpty() && differ > 0){ // 저장된 과목을 끝내는 경우
                        if(stack.peek().time <= differ){
                            answer.add(stack.peek().subject);
                            differ -= stack.pop().time;// differ를 줄여 줌
                        }else{
                            //differ가 더 작은 경우
                            Assignment tmp = stack.pop();
                            stack.push(new Assignment(tmp.subject, tmp.time - differ));
                            break;//종료조건
                        }
                    }
                }
            }
        }
            //아직 남았다면
            while(!stack.isEmpty()) answer.add(stack.pop().subject);
                       
        return answer.toArray(new String[0]); //List to Array
    }
    
    private int makeTime(String[] hhmm){
        return Integer.parseInt(hhmm[0]) * 60 + Integer.parseInt(hhmm[1]);
    }
}