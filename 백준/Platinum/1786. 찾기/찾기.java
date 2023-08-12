import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main{
    static int cnt = 0;
    static List<Integer> li;
    static int[] getPi(String pattern){
        int size = pattern.length();
        int[] pi = new int[size];
        int j = 0;
        for(int i = 1; i < size; i++){
            while(j > 0 && pattern.charAt(i) != pattern.charAt(j)){
                j = pi[j - 1];
            }
            if(pattern.charAt(i) == pattern.charAt(j)) pi[i] = ++j;
        }
        return pi;
    }
    private static void KMP(String origin, String pattern){
        int pi[] = getPi(pattern);
        int j = 0;
        for(int i = 0; i < origin.length(); i++){
            while(j > 0 && origin.charAt(i) != pattern.charAt(j)){
                j = pi[j - 1];
            }
            if(origin.charAt(i) == pattern.charAt(j)){
                if(j == pattern.length() - 1){
                    ++cnt;
                    li.add(i - j + 1);
                    j = pi[j];
                }
                else j++;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String origin = br.readLine();
        String pattern = br.readLine();
        li = new ArrayList<>();
        KMP(origin, pattern);
        System.out.println(cnt);
        for(int i = 0; i < cnt; i++){
            System.out.println(li.get(i));
        }
    }
}