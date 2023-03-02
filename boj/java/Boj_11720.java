import java.util.Scanner;

public class Boj_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        char[] input = scanner.nextLine().toCharArray();
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            result += input[i] - '0';
        }

        System.out.println(result);
    }
}
