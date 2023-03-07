import java.util.Scanner;

public class Boj_9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            int cnt = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(')
                    cnt++;
                else
                    cnt--;
                if (cnt < 0)
                    break;
            }
            if (cnt != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
