import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        while (true) {
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = readInt();
                arr[i] *= arr[i];
            }
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;
            else if (arr[0] + arr[1] == arr[2]
                     || arr[0] + arr[2] == arr[1]
                     || arr[0] == arr[1] + arr[2])
                sb.append("right\n");
            else
                sb.append("wrong\n");
        }
        
        System.out.print(sb);
    }
    
    static int readInt() throws IOException {
        int n = 0;
        while (true) {
            int input = System.in.read();
            if (input <= 32)
                return n;
            else
                n = (n << 3) + (n << 1) + (input & 15);
        }
    }
}