import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(
        a.chars()
        .map(c -> {
            if(Character.isUpperCase(c)) return Character.toLowerCase(c);
            else return Character.toUpperCase(c);
        })
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        );
    }
}