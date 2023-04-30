import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int answer = 0;
        while(T-- > 0){
            String str = sc.next();
            boolean isGroupWord = true;
            //단어마다 갱신해서 확인 필요.
            boolean[] visited = new boolean[128];
            char prev = str.charAt(0);
            visited[prev] = true;
            for(int i = 1; i < str.length(); i++){
                char c = str.charAt(i);
                   if(c!=prev){
                      if(visited[c]){
                          isGroupWord = false;
                          break;
                      }else{
                       visited[c] = true;
                       prev = c;
                   }
                }
            }
            if(isGroupWord) answer++; 
        }    
        System.out.println(answer);
    }
}