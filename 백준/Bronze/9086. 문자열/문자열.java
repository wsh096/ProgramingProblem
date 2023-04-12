import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s = br.readLine();
            String answer = s.substring(0,1)+s.substring(s.length()-1,s.length());
            System.out.println(answer);
        }
        br.close();
    }
}