import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int G = gcd(A,B);
        bw.write(String.valueOf(G));
        bw.newLine();
        bw.write(String.valueOf(A*B/G));         
        bw.flush();
        bw.close();
        br.close();
    }
    private static int gcd(int A, int B){
        if(B==0){
            return A;
        }
        return gcd(B, A % B);
    }             
}