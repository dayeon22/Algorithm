import java.util.Scanner;

public class Boj_1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int input = scanner.nextInt();

        while (input > 0) {
            arr[input % 10]++;
            input /= 10;
        }

        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9 && max < arr[i])
                max = arr[i];
        }
        max = Math.max(max, (arr[6] + arr[9] + 1) / 2);
        System.out.println(max);
    }
}
