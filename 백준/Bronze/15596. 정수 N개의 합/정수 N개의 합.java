import java.util.Arrays;
public class Test {
    long sum(int[] a) {
        return Arrays.stream(a).mapToLong(Long::valueOf).sum();
    }
}
