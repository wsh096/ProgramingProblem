class Solution {
    int answer = 0;
    int[] n;
    int t;
    public int solution(int[] numbers, int target) {
        n = numbers;
        t = target;
        op(0, 0);

        return answer;
    }
    private void op(int i, int value){
        
        if(i == n.length){
            if(value == t){
                answer++;
            }
            return;
        }
        op(i + 1, value + n[i]);
        op(i + 1, value - n[i]);        
    }
}