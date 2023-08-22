import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_1913 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int cnt = 1;
        int i = n / 2;
        int j = n / 2;
        int move = 1;

        while (cnt <= n * n) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < move; y++) {
                    arr[i][j] = cnt++;
                    i += dx[x];
                    j += dy[x];
                }
                if (x % 2 == 1)
                    move++;
                if (cnt > n * n)
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        int resi = 0, resj = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == k) {
                    resi = i + 1;
                    resj = j + 1;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        System.out.println(resi + " " + resj);
    }
}
