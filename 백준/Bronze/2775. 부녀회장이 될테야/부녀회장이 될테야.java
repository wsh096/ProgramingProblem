import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            if(B==1) bw.write("1");
            else{
                int[][] apartment = new int[A+2][B+2];
                for(int i = 1; i <= B; i++){
                    apartment[0][i] = i;
                }
                for(int i = 1; i <= A; i++){
                    apartment[i][1] = 1;
                }
                for(int i = 1; i <= A; i++){
                    for(int j = 1; j <= B; j++){
                        apartment[i][j] = apartment[i-1][j] + apartment[i][j-1];
                    }
                }
                bw.write(String.valueOf(apartment[A][B]));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}