import java.util.Arrays;
import java.util.Scanner;

public class Boj_10818 {
    public static void main(String[] args) {
        first();
        second();
    }

    public static void first() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int min = scanner.nextInt();
        int max = min;
        for (int i = 1; i < n; i++) {
            int input = scanner.nextInt();
            min = min > input ? input : min;
            max = max < input ? input : max;
        }
        System.out.println(min + " " + max);
    }

    public static void second() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n - 1]);
    }
}
