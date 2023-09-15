import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] F = new int[1000001];
        int[] answer = new int[1000001];
        int[] nums = new int[1000001];
        Stack<Integer> stack = new Stack<>();
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(input[i]);
            F[nums[i]]++;
        }
        for(int i = n - 1; i >= 0; i--){
            int number = nums[i];
            int height = F[number];
            while(!stack.isEmpty()){
                int topNum = nums[stack.peek()];
                int topHeight = F[topNum];
                if(height >= topHeight){
                    stack.pop();
                }else{
                    break;
                }
            }
            answer[i] = -1;
            if(!stack.isEmpty()){
                answer[i] = nums[stack.peek()];
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}