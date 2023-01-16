package ch03.greedy;

import java.util.Scanner;

// [3-2] Greedy - 큰 수의 법칙
public class Greedy_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int arr[] = new int[n];
        int i = 0;

        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 내림차순 정렬
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        first(m, k, arr);
        second(m, k, arr);
    }

    public static void first(int m, int k, int[] arr) {
        int result = 0;

        for (int i = 0; i < m; i++) {
            if (i != 0 && i % k == 0)
                result += arr[1];
            else
                result += arr[0];
        }
        System.out.println(result);
    }

    // k가 3이라면 가장큰수 + 가장큰수 + 가장큰수 + 두번째큰수 + ... 이런식으로 반복된다.
    // 이 규칙을 수학적으로 표현해보면
    // arr[0] * ((m / (k + 1)) * k + m % (k + 1)) + arr[1] * (m / (k + 1)) 가 된다.
    // m / (k + 1): 수열이 반복되는 횟수
    // (m / (k + 1)) * k: 가장 큰 수가 더해지는 횟수
    // m % (k + 1): m이 k + 1로 나누어떨어지지 않을 때 더해지는 수
    // 두번째로 큰 수가 더해지는 횟수는 (m / (k + 1))으로 표현해도 되고, (m - 가장 큰 수가 더해지는 횟수)로 표현해도 된다.
    public static void second(int m, int k, int[] arr) {
        int result = 0;

        result = arr[0] * ((m / (k + 1)) * k + m % (k + 1)) + arr[1] * (m / (k + 1));
        System.out.println(result);
    }
}
