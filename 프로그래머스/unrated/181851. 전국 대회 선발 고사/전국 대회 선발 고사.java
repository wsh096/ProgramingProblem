//쉬운 풀이 생각이 안 나네요 ㅠ
import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
       int[][] possible = new int[rank.length][2];
        for(int[] i : possible) Arrays.fill(i,Integer.MAX_VALUE);
        
        for(int i = 0 ; i < rank.length; i++)
            if(attendance[i]) possible[i] = new int[] {rank[i],i};                
               
       Arrays.sort(possible,(p1,p2)->p1[0]-p2[0]);
 
        return possible[0][1]*10000 + possible[1][1]*100 + possible[2][1];
    }
}