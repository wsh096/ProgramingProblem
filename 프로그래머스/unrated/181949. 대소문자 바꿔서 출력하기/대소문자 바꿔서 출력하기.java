import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        System.out.println(
        a.chars()
        .map(c -> {
            if(Character.isUpperCase(c)) return Character.toLowerCase(c);
            else return Character.toUpperCase(c);
        })
        .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append));
    }
}