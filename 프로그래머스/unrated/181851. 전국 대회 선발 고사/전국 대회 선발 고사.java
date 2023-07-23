import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
class Student{
    int rank;
    int idx;
    boolean attendance;
    Student(int rank, int idx, boolean attendance){
        this.rank = rank;
        this.idx = idx;
        this.attendance = attendance;
    }
}
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Student> students = new LinkedList<>();
        int answer = 0;
        for(int i = 0; i < rank.length; i++){
            students.add(new Student(rank[i],i,attendance[i]));            
        }
        Collections.sort(students, (a,b)-> a.rank-b.rank);
        int cnt = 0;
        for(Student student : students){
            if(!student.attendance) continue;
            else{
                switch(cnt){
                        case 0:
                        answer += 10000 * student.idx;
                        break;
                        case 1:
                        answer += 100 * student.idx; 
                        break;
                        case 2:
                        answer += student.idx;
                        break;
                }
                cnt++;
            }
            if(cnt == 3) break;
        } 
        return answer;
    }
}