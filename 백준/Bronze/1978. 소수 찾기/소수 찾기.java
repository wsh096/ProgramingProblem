import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        //에라토스테네스의 체 만들기
        int answer = 0;
        boolean[] 에라토스테네스의체 = new boolean[1001];
        에라토스테네스의체[1] = true;
        
        for(int i = 2; i*i <=1000; i++){
            if(!에라토스테네스의체[i]){
                for(int j = i * i; j <= 1000; j+= i) 
                    에라토스테네스의체[j] = true; //소수가 아닌 표시.
            }
        }
        for(int i = 0; i < T; i++){
            if(!에라토스테네스의체[Integer.parseInt(input[i])]) answer++;    
        }
        System.out.println(answer);
        br.close();
    }
}