class Solution {
    public int solution(int a, int b) {
       if(a % 2 == 1 && b % 2 == 1){
           return (int)Math.pow(a,2) + (int)Math.pow(b,2);
       }
        if(a % 2 == 1 || b % 2 == 1){
            return 2*(a + b);
        }
        return (int)Math.abs(a-b);
    }
}