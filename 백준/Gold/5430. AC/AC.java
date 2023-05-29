import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//빈배열일 때, R만 있는 경우, 빈배열을 그대로 넣어서 반환해야 한다.
public class Main{
    public static void main(String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
      
            int T = Integer.parseInt(br.readLine());
        
            for (int i = 0; i < T; i++) {
                char[] operations = br.readLine().toCharArray();
                int n = Integer.parseInt(br.readLine());
                String arrayString = br.readLine();
                List<String> array = new ArrayList<>(Arrays.asList(arrayString.substring(1, arrayString.length() - 1).split(",")));
                
                int reverseCount = 0; // R 연산 횟수
                
                boolean isError = false; // 에러 여부
                
                for (char operation : operations) {
                    if (operation == 'R') {
                        reverseCount++;
                    } else if (operation == 'D') {
                        if (array.isEmpty()||n==0) {
                            isError = true;
                            break;
                        } else {
                            if (reverseCount % 2 == 0) {
                                array.remove(0);
                            } else {
                                array.remove(array.size() - 1);
                            }
                        }
                        n--;
                    }
                }
        
                if (isError) {
                    sb.append("error\n");
                } else {
                    if (reverseCount % 2 == 1) {
                        Collections.reverse(array);
                    }
                    sb.append("[");
                    for (int j = 0; j < array.size(); j++) {
                        sb.append(array.get(j));
                        if (j != array.size() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append("]\n");
                }
            }
        
            System.out.println(sb);
            br.close();
        }
}