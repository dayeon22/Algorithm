import java.util.Scanner;

public class Boj_1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, div, temp;

        while (true) {
            String result = "yes";
            num = scanner.nextInt();
            if (num == 0)
                break;
            temp = num;
            div = 1;
            while (temp > 9) {
                temp /= 10;
                div *= 10;
            }
            while (num > 9) {
                if (num / div != num % 10) {
                    result = "no";
                    break;
                }
                num = (num % div) / 10;
                div = div / 100;
            }

            System.out.println(result);
        }
    }
}
