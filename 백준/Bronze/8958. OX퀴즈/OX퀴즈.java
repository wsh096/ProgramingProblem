import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String result = sc.next();
            int cnt = 0;
            int answer = 0;
            char prev = result.charAt(0);
            if(prev=='O'){
                cnt++;
                answer+=cnt;
            }
            for(int i = 1; i < result.length(); i++){
               char c = result.charAt(i);
                if(c=='O'){
                    cnt++;
                    answer+=cnt;
                }else{
                    cnt = 0;
                }   
            }   
          System.out.println(answer);
        }
    }
}