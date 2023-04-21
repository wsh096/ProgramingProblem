import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        return IntStream.range(0,my_string.length())
            .mapToObj(i -> i >= s && i < s + overwrite_string.length()
                     ? Character.toString(overwrite_string.charAt(i-s))
                     : Character.toString(my_string.charAt(i)))
            .collect(Collectors.joining());
    }
}