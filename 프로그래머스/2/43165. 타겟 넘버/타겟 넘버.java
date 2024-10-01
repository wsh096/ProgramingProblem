class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        op(0, numbers, target, 0);

        return answer;
    }
    private void op(int i,int[] n, int t, int value){
        
        if(i == n.length){
            if(value == t){
                answer++;
            }
            return;
        }
        op(i + 1, n, t, value + n[i]);
        op(i + 1, n, t, value - n[i]);        
    }
}