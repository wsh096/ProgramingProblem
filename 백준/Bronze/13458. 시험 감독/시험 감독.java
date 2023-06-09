import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long answer = 0;
        int student_class = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int [] students = new int[student_class];
        for(int i = 0; i < student_class; i++) students[i] = Integer.parseInt(input[i]);
        
        String[] nums = br.readLine().split(" ");
        int B = Integer.parseInt(nums[0]);
        int C = Integer.parseInt(nums[1]);
        
        for(int student : students){
            student -= B;
            answer++;
            if(student > 0){
              answer += (student + C - 1) / C;
            }
        }
        
        System.out.println(answer);
        br.close();
    }
}