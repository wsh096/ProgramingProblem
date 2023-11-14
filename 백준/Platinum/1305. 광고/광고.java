import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
        
        public static void main(String args[]) throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		String str = br.readLine();
        
        int lastPi = getLastPi(str);
            System.out.println(n - lastPi);
        }
    private static int getLastPi(String str){
        int len = str.length();
        int j = 0, max = 0;
        int[] pi = new int[len];
        char[] chars = str.toCharArray();
        for(int i = 1; i < len; i++){
            while(j > 0 && chars[j] != chars[i]){
                j = pi[j - 1];
            }
            if(chars[j] == chars[i]){
                pi[i] = ++j;
            }
        }
        return pi[len - 1];
    }
}
    
    