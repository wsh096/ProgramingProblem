

public class Solution {
    public int solution(int n) {
       char[] chars = String.valueOf(n).toCharArray();
        int answer = 0;
        for(char c : chars){
            answer += c - '0';
        }
        return answer;
    }
}