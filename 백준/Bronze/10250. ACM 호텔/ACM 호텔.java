import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);
            int front = N % H == 0 ? H : N % H; 
            int back = (N+(H-1))/H;
            StringBuilder sb = new StringBuilder();
            sb.append(front);
            if(back < 10){
                sb.append("0").append(back);
            }else{
                sb.append(back); 
            }
            System.out.println(sb.toString());
        }
        br.close();
    }
}

