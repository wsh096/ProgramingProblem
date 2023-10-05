import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = createInputStreamReader();
        BufferedReader reader = new BufferedReader(inputStreamReader);

        int n = Integer.parseInt(reader.readLine());
        String[] nums = reader.readLine().split(" ");
        int x = Integer.parseInt(reader.readLine());

        int count = countPairs(nums, x);
        System.out.println(count);
    }

    public static InputStreamReader createInputStreamReader() {
        return new InputStreamReader(System.in);
    }

    public static int countPairs(String[] nums, int x) {
        Map<Integer, Integer> numFrequency = new HashMap<>();
        int count = 0;

        for (String numStr : nums) {
            int num = Integer.parseInt(numStr);
            int complement = x - num;
            
            if (numFrequency.containsKey(complement)) {
                count += numFrequency.get(complement);
            }

            numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
