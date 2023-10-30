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
            String[] split = plan[1].split(":");
            int start = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            int time = Integer.parseInt(plan[2]);
            assignments.add(new Assignment(subject, start, time));
        }
        Collections.sort(assignments, (a, b) -> a.start - b.start);

        Stack<Assignment> stack = new Stack<>();
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < assignments.size(); i++) {
           if(i == assignments.size()-1){//마지막인 경우
               answer.add(assignments.get(i).subject);
               break;
           }
            int current = assignments.get(i).start + assignments.get(i).time;
            int next = assignments.get(i + 1).start;
            int differ = next - current;
            if(differ < 0){//끝나지 않은 것. stack에 추가.
                stack.push(new Assignment(assignments.get(i).subject,Math.abs(differ)));
            }else{//충분히 소요되는 것. 두 가지로 나뉨.
                    answer.add(assignments.get(i).subject);
                if(differ > 0){//0보다 큰 경우,
                    while(!stack.isEmpty()&&differ > 0){
                        if(stack.peek().time <= differ){
                            answer.add(stack.peek().subject);
                            differ-=stack.pop().time;
                        }else{
                            //differ가 더 작은 경우
                            Assignment tmp = stack.pop();
                            stack.push(new Assignment(tmp.subject, tmp.time-differ));
                            break;//종료조건
                        }
                    }
                }
            }
        }
            while(!stack.isEmpty())
                answer.add(stack.pop().subject);
                       
        return answer.toArray(new String[0]);
    }
}