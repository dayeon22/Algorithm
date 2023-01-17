package ch03.greedy;

import java.util.Scanner;

// [3-4] Greedy - 1이 될 때까지
public class Greedy_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        first(n, k);
        second(n, k);
    }

    public static void first(int n, int k) {
        int result = 0;

        while (n > 1) {
            if (n % k == 0)
                n = n / k;
            else
                n--;
            result++;
        }

        System.out.println(result);
    }

    // 첫 번째 방법은 n을 1씩 빼기 때문에 비효울적이다.
    // 한번에 n % k를 빼면 시간을 줄일 수 있다.
    public static void second(int n, int k) {
        int result = 0;

        while (n >= k) {
            if (n % k == 0) {
                n = n / k;
                result++;
            } else {
                result += n % k;
                n -= n % k;
            }
        }
        result += n - 1;

        System.out.println(result);
    }
}
