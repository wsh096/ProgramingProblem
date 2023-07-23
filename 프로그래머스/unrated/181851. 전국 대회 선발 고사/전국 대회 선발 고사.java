import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0,rank.length).filter(i->attendance[i]).boxed().sorted((a,b)->rank[a]-rank[b]).limit(3).reduce((cur, next) -> cur*100+next).get();
    }   
}