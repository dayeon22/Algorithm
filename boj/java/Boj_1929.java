import java.util.Scanner;

public class Boj_1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        m = m < 2 ? 2 : m;
        for (int i = m; i <= n; i++) {
            int j;

            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j * j > i)
                System.out.println(i);
        }
    }
}
