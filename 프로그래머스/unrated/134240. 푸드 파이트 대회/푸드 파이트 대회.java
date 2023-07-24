class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            int a = food[i] >> 1;
            if(a == 0) continue;
            while(a -- > 0) sb.append(i);
        }
        StringBuilder reverse = new StringBuilder(sb.toString());
        sb.append(0).append(reverse.reverse());
        
        return sb.toString();
    }
}