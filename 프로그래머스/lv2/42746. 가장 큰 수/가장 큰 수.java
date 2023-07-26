import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        numbers = Arrays.stream(numbers).boxed().sorted((a,b)-> (b+""+a).compareTo(a+""+b)).mapToInt(Integer::intValue).toArray();
        StringBuilder sb = new StringBuilder();
        for(int num : numbers){
            sb.append(num);
        }
               String answer = sb.toString();
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}