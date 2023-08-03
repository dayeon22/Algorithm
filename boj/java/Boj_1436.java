import java.util.Scanner;

public class Boj_1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 665;

        while (n > 0) {
            if (Integer.toString(++i).contains("666"))
                n--;
        }
        System.out.println(i);
    }
}
