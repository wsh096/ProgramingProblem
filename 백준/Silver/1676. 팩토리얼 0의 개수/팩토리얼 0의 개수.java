import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine())/5;
    int answer = 0;
    for(int i = 1; i <= N; i++){
        if(i%25==0){
            answer+=3;
        }else if(i%5==0){
            answer+=2;
        }
        else{
            answer++;
        }
    }
    System.out.println(answer);
    br.close();
    }
}
