import java.util.Scanner;

public class Boj_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int num = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();

        while (num > 0) {
            arr[num % 10]++;
            num = num / 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
