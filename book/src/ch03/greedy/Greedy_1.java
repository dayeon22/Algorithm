package ch03.greedy;

import java.util.Scanner;

// [3-1] Greedy - 거스름돈
// 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정한다.
// 손님이 N원을 냈을 때, 거슬러 주는 동전의 최소 개수를 구하라.
public class Greedy_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("손님이 낸 돈 입력: ");
        int money = scanner.nextInt();
        int count = 0;

        count += money / 500;
        money %= 500;
        count += money / 100;
        money %= 100;
        count += money / 50;
        money %= 50;
        count += money / 10;

        System.out.println("동전 수: " + count);
    }

    public static void second() {
        int coin_types[] = {500, 100, 50, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("손님이 낸 돈 입력: ");
        int money = scanner.nextInt();
        int count = 0;

        for (int coin : coin_types) {
            count += money / coin;
            money %= coin;
        }

        System.out.println("동전 수: " + count);
    }
}
