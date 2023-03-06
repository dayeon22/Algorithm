import java.util.Scanner;

public class Boj_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0, idx = 0;

        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                idx = i;
            }
        }
        System.out.println(max + "\n" + (idx + 1));
    }
}
