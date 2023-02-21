import java.util.Scanner;

public class Boj_11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputs = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            inputs[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (inputs[j] > inputs[j + 1]) {
                    int temp = inputs[j];
                    inputs[j] = inputs[j + 1];
                    inputs[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            result += (inputs[i] * (n - i));
        }
        System.out.println(result);
    }
}
