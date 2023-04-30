import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T -- > 0){
             int A = sc.nextInt();
            if(!list.contains(A)){
                list.add(A);
            }
        }

       Collections.sort(list);

       for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}