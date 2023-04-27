import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <=  90)
              arr[i] += 32;
            else
              arr[i] -= 32;
        }
        System.out.println(new String(arr));
    }
}