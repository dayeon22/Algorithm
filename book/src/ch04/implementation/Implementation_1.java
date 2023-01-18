package ch04.implementation;

import java.util.Scanner;

// [4-1] 구현 - 상하좌우
public class Implementation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rPos = 1, cPos = 1;

        scanner.nextLine();
        String plan = scanner.nextLine();

        for (int i = 0; i < plan.length(); i++) {
            if (plan.charAt(i) == 'L' && cPos > 1) {
                cPos--;
            } else if (plan.charAt(i) == 'R' && cPos < n) {
                cPos++;
            } else if (plan.charAt(i) == 'U' && rPos > 1) {
                rPos--;
            } else if (plan.charAt(i) == 'D' && rPos < n) {
                rPos++;
            }
        }
        System.out.println(rPos + " " + cPos);
    }
}
