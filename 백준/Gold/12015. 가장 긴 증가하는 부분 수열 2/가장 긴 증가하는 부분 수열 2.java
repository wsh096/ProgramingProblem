import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(input[0]));
        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            if (list.get(list.size() - 1) < num) {
                list.add(num);
            } else {
                int left = 0;
                int right = list.size() - 1;
                
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                
                list.set(right, num);
            }
        }
        
        System.out.println(list.size());
    }
}