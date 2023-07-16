import java.util.Scanner;

public class Boj_14503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] map = new int[n][m];
        int[][] move = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int cnt = 0;
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        while (true) {
            if (map[r][c] == 0) {
                map[r][c] = 2;
                cnt++;
            }

            for (i = 0; i < 4; i++) {
                d = d == 0 ? 3 : d - 1;
                int moveR = r + move[d][0];
                int moveC = c + move[d][1];

                if (map[moveR][moveC] == 0) {
                    r = moveR;
                    c = moveC;
                    break;
                }
            }
            if (i == 4) {
                int tempD = d < 2 ? d + 2 : d - 2;
                r = r + move[tempD][0];
                c = c + move[tempD][1];
                if (map[r][c] == 1) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
