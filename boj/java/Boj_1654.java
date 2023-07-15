import java.util.Scanner;

public class Boj_1654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        long sum = 0;
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        long start = 1;
        long end = sum / n;
        int cnt;
        while (end - start > 1) {
            long mid = (start + end) / 2;
            cnt = getCnt(arr, mid, k);
            if (cnt >= n) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (getCnt(arr, end, k) >= n)
            System.out.println(end);
        else
            System.out.println(start);
    }

    static int getCnt(int[] arr, long mid, int k) {
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            cnt += arr[i] / mid;
        }
        return cnt;
    }
}
