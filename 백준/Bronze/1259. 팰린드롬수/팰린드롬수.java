import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            char [] chars = br.readLine().toCharArray();
            if(chars[0]=='0') break;
            int start = 0;
            int end = chars.length-1;
            boolean isPalindrome = true;
            while(start <= end){
                if(chars[start] != chars[end]){
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            if(isPalindrome){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}