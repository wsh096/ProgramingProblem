import java.util.Arrays;
class Solution {
    public int solution(int[][] triangle) {
    int t_size = triangle.length - 1;
        while(t_size > 0){
            for(int i = 0; i < t_size; i++){
                triangle[t_size-1][i] += Math.max(triangle[t_size][i], triangle[t_size][i + 1]); 
            }
            t_size--;
        }
    return triangle[0][0];
    }
}