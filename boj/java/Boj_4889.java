import java.util.Scanner;

public class Boj_4889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            int sum = 0;
            int result = 0;
            String input = scanner.nextLine();
            if (input.contains("-"))
                break;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '{')
                    sum++;
                else if (input.charAt(j) == '}')
                    sum--;

                if (sum < 0) {
                    result++;
                    sum = 1;
                }
            }
            System.out.println(++i + ". " + (result + (sum / 2)));
        }
    }
}
