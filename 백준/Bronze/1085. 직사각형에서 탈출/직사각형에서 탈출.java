import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        
        int case1 = Math.min(x,w - x);
        int case2 = Math.min(y,h - y);
        
        int answer = Math.min(case1, case2);
        
        System.out.println(answer);
        
        br.close();
    }
}