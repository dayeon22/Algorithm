package ch04.implementation;

import java.util.Scanner;

// [4-2] 구현 - 시각
public class Implementation_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        first(n);
        second(n);
    }

    public static void first(int n) {
        int h = 0, m = 0, s = 0, cnt = 0;

        while (true) {
            s++;
            if (s == 60) {
                m++;
                s = 0;
            } if (m == 60) {
                h++;
                m = 0;
            }
            if (h / 10 == 3 || h % 10 == 3 || m / 10 == 3 ||
                    m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
                cnt++;
            if (h == n && m == 59 && s == 59)
                break;
        }
        System.out.println(cnt);
    }

    public static void second(int n) {
        int cnt = 0;

        for (int h = 0; h < n + 1; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (h / 10 == 3 || h % 10 == 3 || m / 10 == 3 ||
                            m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
