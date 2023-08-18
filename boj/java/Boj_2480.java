import java.util.Scanner;

public class Boj_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result;

        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a == b) {
            result = 1000 + a * 100;
        } else if (b == c) {
            result = 1000 + b * 100;
        } else if (a == c) {
            result = 1000 + a * 100;
        } else {
            int max = Math.max(a, b);
            max = Math.max(max, c);
            result = max * 100;
        }
        System.out.println(result);
    }
}
