import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        int[] remainder = new int[m]; // 나머지 값 같은 값 구하기.
        int sum = 0;
        int num = 0;
        
        for(int i = 1; i <= n; i++){
            num = Integer.parseInt(st.nextToken()); // 1. 배열에 집어 넣고
            sum = (sum + num) % m; // 2. sum 계산(처음것도 계산하기 위해, 1부터 시작)
            remainder[sum]++;// 3. 누적합의 나머지 개수 구하기.
        }
        long result = remainder[0];
        for(int i = 0; i < m; i++){
            result += (long)remainder[i] * (remainder[i] - 1) / 2; // (1~j)%M == (1~i-1)%M 두 개의 경우를 가지는 경우의 수.
        }
        System.out.println(result);
    }
}