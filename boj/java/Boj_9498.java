import java.util.Scanner;

public class Boj_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String result;

        if (score >= 90)
            result = "A";
        else if (score >= 80)
            result = "B";
        else if (score >= 70)
            result = "C";
        else if (score >= 60)
            result = "D";
        else
            result = "F";
        System.out.println(result);
    }
}
