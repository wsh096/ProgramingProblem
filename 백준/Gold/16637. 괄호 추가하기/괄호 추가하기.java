import java.util.Scanner;
public class Main{
    public static int N;
    public static char[] input;
    public static long result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        input = sc.nextLine().toCharArray();
        result = Integer.MIN_VALUE;
        solve(2, (long)(input[0] - '0'));

            System.out.println(result);
    }
    private static void solve(long i, long sum){
        if(i >= N){
            result = (long)Math.max(result, sum);
            return;
        }

        solve(i + 2, op(sum, (long)(input[(int)i] - '0') ,input[(int)i - 1]));
        
        if(i + 2 < N){
            long right = op((long)(input[(int)i] - '0'), (long)(input[(int)i + 2] - '0'), input[(int)i + 1]);
            long left = op(sum, right, input [(int)i - 1]);
            solve(i + 4, left);
        }
    }
    private static long op(long i, long j, char op){
        switch(op){
            case '+':
                return i + j;
            case '-':
                return i - j;
            case '*':
                return i * j;  
        }
        return 0;
    }
}