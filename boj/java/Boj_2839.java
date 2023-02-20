import java.util.Scanner;

public class Boj_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        first(n);
        second(n);
    }

    public static void first(int n) {
        int five = n / 5;

        if (n % 5 == 0) {
            System.out.println(five);
            return ;
        }
        while (five >= 0) {
            int left = n - (5 * five);
            if (left % 3 == 0) {
                System.out.println(five + (left / 3));
                return ;
            }
            five--;
        }
        System.out.println(-1);
    }

    public static void second(int n) {
        int res = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                System.out.println(res + (n / 5));
                return ;
            }
            res++;
            n -= 3;
        }
        System.out.println(-1);
    }
}
