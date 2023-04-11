import java.util.Scanner;
import java.util.TreeSet;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    TreeSet<Integer> set = new TreeSet<>();
        int max = 0;
        for(int i = 0; i < 3; i++){
            int dice = sc.nextInt();
            if(set.contains(dice)){
                max = dice;
            }else{
                set.add(dice);
            }
        }
        if(set.size() == 1)
        max = max * 1000 +10000;
        if(set.size() == 2)
        max = max * 100 +1000;
        if(set.size() == 3)
         max = set.last() * 100; 
 
    System.out.println(max);
    }
}
