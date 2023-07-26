import java.util.Scanner;

public class Boj_2960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        boolean[] numbers = new boolean[n + 1];
        int cnt = 0;

        numbers[0] = numbers[1] = true;
        for (int i = 2; i <= n; i++) {
            if (!numbers[i]) {
                for(int j = i; j <= n; j += i) {
                    if (!numbers[j]) {
                        cnt++;
                        numbers[j] = true;
                    }
                    if (cnt == k) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}
