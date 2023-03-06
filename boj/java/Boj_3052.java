import java.util.Scanner;

public class Boj_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[42];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int idx = scanner.nextInt() % 42;
            if (arr[idx] == 0)
                cnt++;
            arr[idx]++;
        }
        System.out.println(cnt);
    }
}
