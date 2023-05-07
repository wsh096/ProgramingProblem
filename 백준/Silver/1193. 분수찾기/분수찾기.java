import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cross = 1, prevs = 0;
        while(true){
            if(N <= cross + prevs){
                if(cross % 2 == 1)
                    System.out.println((cross-(N-prevs-1))+"/"+(N-prevs));
                else
                    System.out.println((N-prevs)+"/"+(cross-(N-prevs-1)));
                break;
            }else
                prevs += cross++;
        }    
        br.close();
    }
}