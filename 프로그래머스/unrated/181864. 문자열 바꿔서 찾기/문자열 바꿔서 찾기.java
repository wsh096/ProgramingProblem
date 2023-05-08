class Solution {
    public int solution(String myString, String pat) {
        char[] chars = myString.toCharArray();
        for(int i = 0; i < chars.length; i++)
            chars[i] = chars[i] > 'A' ? 'A' : 'B';
        
        return new String(chars).contains(pat) ? 1 : 0;
    }
}