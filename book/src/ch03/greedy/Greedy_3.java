package ch03.greedy;

import java.util.Scanner;

// [3-3] Greedy - 숫자 카드 게임
public class Greedy_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        int small = 0, result = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
                if (j == 0 || small > arr[i][j])
                    small = arr[i][j];
            }

            // result = Math.max(result, small); 도 사용 가능
            if (i == 0 || result < small)
                result = small;
        }

        System.out.println(result);
    }
}
