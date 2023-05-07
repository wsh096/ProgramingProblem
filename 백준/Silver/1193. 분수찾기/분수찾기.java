import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cross = 1, prevs = 0;
        while(true){
            if(N <= cross + prevs){
                //대각선이 홀수면, 분자감소, 분모증가.
                if(cross % 2 == 1)
                    System.out.println((cross-(N-prevs-1))+"/"+(N-prevs));
                else//대각선이 짝수면, 분자증가, 분모감소.
                    System.out.println((N-prevs)+"/"+(cross-(N-prevs-1)));
                break;
            }else
                prevs += cross++;
        }    
        br.close();
    }
}