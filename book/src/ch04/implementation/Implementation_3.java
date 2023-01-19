package ch04.implementation;

import java.util.Scanner;

// [4-3] 구현 - 왕실의 나이트
public class Implementation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int col = input.charAt(0) - 'a' + 1;
        int row = input.charAt(1) - '0';
        int cnt = 0;
        int[][] move = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}};

        for (int i = 0; i < 8; i++) {
            int posR = row - move[i][0];
            int posC = col - move[i][1];

            if (posR < 1 || posR > 8 || posC < 1 || posC > 8)
                continue;
            cnt++;
        }

        System.out.println(cnt);
    }
}
