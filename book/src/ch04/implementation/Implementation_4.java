package ch04.implementation;

import java.util.Scanner;

// [4-4] 구현 - 게임 개발
public class Implementation_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int posR = scanner.nextInt();
        int posC = scanner.nextInt();
        int posD = scanner.nextInt();
        int[][] map = new int[row][col];
        int[][] move = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};  // 북 동 남 서
        int cnt = 1;
        int rotateCnt = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        while (true) {
            posD = turnLeft(posD);
            rotateCnt++;
            int tempR = posR + move[posD][0];
            int tempC = posC + move[posD][1];

            if (map[tempR][tempC] == 0) {
                map[posR][posC] = 1;
                posR = tempR;
                posC = tempC;
                cnt++;
                rotateCnt = 0;
            }
            if (rotateCnt == 4) {
                posR--;
                rotateCnt = 0;
                if (map[posR][posC] == 1)
                    break;
            }
        }
        System.out.println(cnt);
    }

    public static int turnLeft(int posD) {
        return posD == 0 ? 3 : posD - 1;
    }
}
