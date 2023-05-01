//1. 기본 풀이. charAt()메서드를 호출하는 것 보다. index로 접근하는게 더 효율적

class Solution {
    public String solution(String my_string, int m, int c) {
        if(m==1) return my_string;
        StringBuilder answer = new StringBuilder();
        char[] chs = my_string.toCharArray();
        for(int i = c-1; i < chs.length; i += m){
            answer.append(chs[i]);
        }
        return answer.toString();
    }
}

