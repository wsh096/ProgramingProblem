class Solution {
    public int solution(String num_str) {
        char[] arr = num_str.toCharArray();
        int answer = 0;
        for(char c : arr) answer += c-'0';
        return answer;
    }
}