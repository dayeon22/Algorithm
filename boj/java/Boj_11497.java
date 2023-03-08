import java.util.Arrays;
import java.util.Scanner;

public class Boj_11497 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int[] newArr = new int[n];
            for (int j = 0; j < n / 2; j++) {
                newArr[j] = arr[j * 2];
                newArr[n - j - 1] = arr[j * 2 + 1];
                if (n % 2 == 1) {
                    newArr[n / 2] = arr[n - 1];
                }
            }

            int difficulty = Math.abs(newArr[n - 1] - newArr[0]);
            for (int j = 1; j < n; j++) {
                int diff = Math.abs(newArr[j] - newArr[j - 1]);
                if (diff > difficulty)
                    difficulty = diff;
            }
            System.out.println(difficulty);
        }
    }
}
