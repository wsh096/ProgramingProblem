import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       char[] chars = br.readLine().toCharArray();
       int answer = 1;
       int left = 0;
       int right = chars.length-1;
       while(left < right){
           if(chars[left] == chars[right]){
               left++;
               right--;
           }else{
               answer=0;
               break;
           }
       }
           
           System.out.println(answer);
       br.close();
   } 
}
