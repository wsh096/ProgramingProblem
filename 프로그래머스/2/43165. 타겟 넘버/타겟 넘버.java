class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        op(0, numbers, target, 0, '+');
        op(0, numbers, target, 0, '-');
        return answer / 2;
    }
    private void op(int i,int[] n, int t, int value, char op){
        
        if(i == n.length){
            if(value == t){
                answer++;
            }
            return;
        }
        int temp;
        switch(op){
            case '+':
               temp  = value + n[i];
                op(i + 1, n, t, temp, '+');
                op(i + 1, n, t, temp, '-');
                break;
            case '-':
                temp = value - n[i];
                op(i + 1, n, t, temp, '+');
                op(i + 1, n, t, temp, '-');
                break;
        }
    }
}