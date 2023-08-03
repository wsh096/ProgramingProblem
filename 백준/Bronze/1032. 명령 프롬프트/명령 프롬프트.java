import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main{
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] standard = br.readLine().toCharArray();
        for(int i = 1; i < n; i++){
           char[] temp = br.readLine().toCharArray();
           for(int j = 0; j < temp.length; j++){
            if(standard[j] == '?') continue;
            if(temp[j]!=standard[j]) standard[j] ='?';
           }      
        }
        System.out.println(new String(standard));
    }
}