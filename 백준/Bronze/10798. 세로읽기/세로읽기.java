import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[5][];
        int LargestLen = 0;
        for(int i = 0; i < 5; i++) {
            char[] temp = br.readLine().toCharArray();
            arr[i] = temp;
            LargestLen = LargestLen > temp.length ? LargestLen : temp.length; 
        }
        
        for(int j = 0; j < LargestLen; j++)
            for(int i = 0; i < 5; i++){
            if (j >= arr[i].length) continue; 
            sb.append(arr[i][j]);    
        }
        System.out.println(sb);
        br.close();
    }
}