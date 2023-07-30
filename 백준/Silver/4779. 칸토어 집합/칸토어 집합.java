import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N == 0) {
                System.out.println("-");
            } else {
                String cantor = cantorSet(N);
                System.out.println(cantor);
            }
        }

        sc.close();
    }

    private static String cantorSet(int N) {
        if (N == 0) {
            return "-";
        }

        String prev = cantorSet(N - 1);
        StringBuilder sb = new StringBuilder();
        for (char c : prev.toCharArray()) {
            sb.append(c);
        }
        for (int i = 0; i < prev.length(); i++) {
            sb.append(" ");
        }
        for (char c : prev.toCharArray()) {
            sb.append(c);
        }

        return sb.toString();
    }
}
