//1. 기본 풀이
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] ch = my_string.toCharArray(); 
        for(int i = 0; i < ch.length; i++){
            if(Character.isUpperCase(ch[i])) answer[ch[i]-'A']++;
            if(Character.isLowerCase(ch[i])) answer[ch[i]-'a'+26]++;
        }
        return answer;
    }
}
