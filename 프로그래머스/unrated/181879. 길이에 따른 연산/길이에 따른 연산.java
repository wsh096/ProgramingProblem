import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        return (length >= 11) ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce(1,(a,b) -> a * b);
    }
}