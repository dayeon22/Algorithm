import java.util.Scanner;

public class Boj_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt() + scanner.nextInt();

        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }
        if (h >= 24) {
            h = h % 24;
        }
        System.out.println(h + " " + m);
    }
}
