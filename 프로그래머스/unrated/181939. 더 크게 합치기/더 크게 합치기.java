class Solution {
    public int solution(int a, int b) {
        return Integer.parseInt(String.valueOf(a).concat(String.valueOf(b))) > Integer.parseInt(String.valueOf(b).concat(String.valueOf(a))) 
            ? Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)))
            : Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));
    }
}