import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        char[] origin = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());
        
        int[][] cumulativeSum = new int[26][origin.length + 1];
        for(int i = 0; i < origin.length; i++){
            for(int j = 0; j < 26; j++){
                cumulativeSum[j][i + 1] = cumulativeSum[j][i];
            }
             cumulativeSum[origin[i] - 'a'][i + 1]++;   
        }
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            char c = input[0].charAt(0);
            int l = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);
            
            int temp = cumulativeSum[c - 'a'][r + 1] - cumulativeSum[c - 'a'][l];
            answer.append(temp).append("\n");
        }
        System.out.println(answer);
    }
}