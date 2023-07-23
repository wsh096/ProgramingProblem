import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main{
    
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            isPalindrome(br.readLine());
        }
        System.out.println(sb);
    }
    private static void isPalindrome(String str){
        int a = recursive(str, 0, str.length()-1);
        sb.append(a).append(" ").append(cnt).append("\n");
        cnt = 0;
    }
    private static int recursive(String str, int start, int end){
        cnt++;
        if(start >= end) return 1;
        else if(str.charAt(start) != str.charAt(end)) return 0;
        else return recursive(str, start + 1, end-1);
    }
}
    
                                                         