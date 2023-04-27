import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num) {
        //모든 원소들의 곱 < 모든 원소들의 합의 제곱 ?  1 : 0 ; 
        return IntStream.of(num).reduce(1,(x,y)->x*y) < Math.pow(IntStream.of(num).sum(),2) ? 1 : 0;
    }
}