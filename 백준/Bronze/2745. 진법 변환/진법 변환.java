import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String target = input[0];
        int N = Integer.parseInt(input[1]);
        int answer = converter(target, N);
        System.out.println(answer);
    }
    private static int converter(String s, int a){
        int result = 0;
        int digit;
        int len = s.length();
        char[] chars = s.toCharArray();
        for(int i = 0; i < len; i++){
            char cur = chars[i];
            if('0' <= cur && cur <= '9'){
                digit = cur-'0';
            } else{
                digit = cur - 'A' + 10;
            }
            result += digit * Math.pow(a, len-1-i);//자리수에 따른 값의 계산.
        }
        return result;
    }
}