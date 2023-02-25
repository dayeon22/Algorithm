import java.util.Scanner;

public class Boj_11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int res = 0;
        int[] arr = new int[n];
        int i = 0;

        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        while (--i >= 0 && k > 0) {
            res += k / arr[i];
            k = k % arr[i];
        }

        System.out.println(res);
    }
}
