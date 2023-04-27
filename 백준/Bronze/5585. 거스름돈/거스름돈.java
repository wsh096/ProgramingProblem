import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] 잔돈 = {500,100,50,10,5,1};
        int money = 1000 - sc.nextInt();
        int answer = 0;
        int idx = 0;
        while(money > 0){
          if(잔돈[idx] <= money){
              money -= 잔돈[idx];
              answer++;
          }else{
              idx++;
          }
        }
        System.out.println(answer);
    }
}