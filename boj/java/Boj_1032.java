import java.util.Scanner;

public class Boj_1032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        char[] str = scanner.nextLine().toCharArray();

        for (int i = 1; i < n; i++) {
            char[] str2 = scanner.nextLine().toCharArray();
            for (int j = 0; j < str.length; j++) {
                if (str[j] != str2[j]) {
                    str[j] = '?';
                }
            }
        }
        System.out.println(str);
    }
}
