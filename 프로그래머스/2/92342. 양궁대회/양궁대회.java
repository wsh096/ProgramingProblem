class Solution {
    int[] result = new int[11];
    int[] answer = {-1};
    int max = Integer.MIN_VALUE;
    public int[] solution(int n, int[] info) {
        backTracking(0, n, info);
        return max == -1 ? new int[] {-1} : answer;
    }
    private void backTracking(int depth, int n, int[] info){
        if(depth == n) {
            int differ = score(info);
            if(max <= differ){
                max = differ;
                answer = result.clone();
            }
            return;
        }
        for(int i = 0; i < info.length && result[i] <= info[i]; i++){
            result[i] += 1;
            backTracking(depth + 1, n, info);
            result[i] -= 1;
        }
    }
    private int score(int[] info){
        int apeach = 0, ryan = 0;
        for(int i = 0; i < result.length; i++){
            if(info[i] == 0 && result[i] == 0) continue;
            if(info[i] >= result[i]) apeach += 10 - i;
            else ryan += 10 - i;
        }
        int differ = ryan - apeach;
        return differ <= 0 ? -1 : differ;
    }
}