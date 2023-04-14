import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        setting(map);
        int answer = 0;
        for(int i = 0; i < str.length(); i++)
            answer += map.get(str.charAt(i));
        System.out.println(answer);
    }
    private static void setting(Map<Character, Integer> map){
        map.put(' ',2);//1누름
        map.put('A',3);
        map.put('B',3);
        map.put('C',3);
        map.put('D',4);
        map.put('E',4);
        map.put('F',4);
        map.put('G',5);
        map.put('H',5);
        map.put('I',5);
        map.put('J',6);
        map.put('K',6);
        map.put('L',6);
        map.put('M',7);
        map.put('N',7);
        map.put('O',7);
        map.put('P',8);
        map.put('Q',8);
        map.put('R',8);
        map.put('S',8);
        map.put('T',9);
        map.put('U',9);
        map.put('V',9);
        map.put('W',10);
        map.put('X',10);
        map.put('Y',10);
        map.put('Z',10);
        
    }
}