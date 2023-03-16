import java.util.Scanner;

public class Boj_2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0, i = 0;

        for (i = 0; i < n; i++) {
            sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if (sum == n)
                break;
        }
        if (i == n)
            System.out.println("0");
        else
            System.out.println(i);
    }
}
