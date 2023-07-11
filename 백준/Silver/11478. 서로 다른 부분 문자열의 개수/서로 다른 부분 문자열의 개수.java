import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class Main{
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        char[] chars = br.readLine().toCharArray();
            for(int i = 0; i < chars.length; i++){
                makeSize(i, chars, set);
            }
        System.out.println(set.size());
    }
    private static void makeSize(int N, char[] chars, Set<String> set){
        StringBuilder sb = new StringBuilder();
        for(int i = N; i < chars.length; i++){ 
            sb.append(chars[i]);
            set.add(sb.toString());
        }
    }
}