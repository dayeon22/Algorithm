import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Boj_2108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int[] mode = new int[8001];
        int cnt = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < cnt; i++) {
            int num = scanner.nextInt();
            arr.add(num);
            sum += num;
            mode[4000 + num]++;
        }
        arr.sort(Comparator.naturalOrder());

        int max = 0;
        for (int i = 0; i < 8001; i++) {
            if (max < mode[i]) {
                max = mode[i];
            }
        }

        int mod = 0;
        int flag = 0;
        for (int i = 0; i < 8001; i++) {
            if (mode[i] == max && flag == 0) {
                mod = i - 4000;
                flag = 1;
            } else if (mode[i] == max && flag == 1) {
                mod = i - 4000;
                break;
            }
        }

        int avg = sum < 0 ? (int)((double)sum / cnt - 0.5) : (int)((double)sum / cnt + 0.5);
        System.out.println(avg);
        System.out.println(arr.get(cnt / 2));
        System.out.println(mod);
        System.out.println(arr.get(cnt - 1) - arr.get(0));
    }
}
