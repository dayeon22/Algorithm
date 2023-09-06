import java.util.Scanner;

public class Boj_1924 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = 0;

        for (int i = 1; i < x; i++) {
            switch(i) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    sum += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    sum += 30;
                    break;
                case 2:
                    sum += 28;
                    break;
            }
        }
        sum += y;

        System.out.println(day[sum % 7]);
    }
}
