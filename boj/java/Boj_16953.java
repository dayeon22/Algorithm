import java.util.Scanner;

public class Boj_16953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cnt = 0;
        
        while (a < b) {
            if (b % 10 == 1) {
                b = b / 10;
            } else if (b % 2 == 0) {
                b = b / 2;
            } else {
                break;
            }
            cnt++;
        }
        
        if (a == b) {
            System.out.println(cnt + 1);
        } else {
            System.out.println(-1);
        }
    }
}
