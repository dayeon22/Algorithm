import java.util.Scanner;

public class Boj_1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int min = x < w - x ? x : w - x;
        min = min < y ? min : y;
        min = min < h - y ? min : h - y;
        System.out.println(min);
    }
}
