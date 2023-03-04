import java.util.Scanner;

public class Boj_2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int i, flag = 0;

        for (i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[0] == 1)
            flag = 1;
        else if (arr[0] == 8)
            flag = -1;
        for (i = 0; i < 8; i++) {
            if (!(flag == 1 && arr[i] == i + 1) && !(flag == -1 && arr[i] == 8 - i))
                break;
        }
        if (i != 8)
            System.out.println("mixed");
        else if (flag == 1)
            System.out.println("ascending");
        else
            System.out.println("descending");
    }
}
