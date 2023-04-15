class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] nums = {781, 156, 31, 6, 1}; 
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (int j = 0; j < 5; j++) {
                if (c == vowels[j]) {
                    answer += 1 + j * nums[i]; 
                    break;
                }
            }
        }
        
        return answer;
    }
}