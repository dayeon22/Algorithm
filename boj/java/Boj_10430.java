import java.util.Scanner;

public class Boj_10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a+b)%c + "\n" + ((a%c)+(b%c))%c + "\n" + (a*b)%c + "\n" + ((a%c)*(b%c))%c);
    }
}
