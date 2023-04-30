import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toUpperCase().toCharArray();
        int[] alphabet = new int[91];
        
        for(int i = 0; i < s.length; i++){
            alphabet[s[i]]++;
        }
        int max  = 0;
        int maxIdx = 0;
        int cnt = 0;
        for(int i = 65; i < alphabet.length; i++){
            if(max < alphabet[i]){
                max = alphabet[i];
                maxIdx = i;
                cnt = 1;
            }else if(max == alphabet[i]){
                cnt++; 
            }
        }
        
        if(cnt > 1) System.out.println("?");
        else System.out.println((char)maxIdx);
            
        
    }
}