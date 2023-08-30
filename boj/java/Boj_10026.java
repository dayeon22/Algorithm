import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_10026 {
    public static int cnt1 = 0;
    public static int cnt2 = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr1 = new char[n][n];
        char[][] arr2 = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = (char)br.read();
                arr2[i][j] = arr1[i][j] == 'G' ? 'R' : arr1[i][j];
            }
            br.read();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i][j] != 'W') {
                    cnt1++;
                    dfs(arr1, i, j, arr1[i][j]);
                }
                if (arr2[i][j] != 'W') {
                    cnt2++;
                    dfs(arr2, i, j, arr2[i][j]);
                }
            }
        }

        System.out.println(cnt1 + " " + cnt2);
    }

    public static void dfs(char[][] arr, int x, int y, char c) {
        if (x < 0 || x >= arr.length || y < 0 || y >= arr.length || arr[x][y] == 'W' || arr[x][y] != c)
            return;
        arr[x][y] = 'W';
        dfs(arr, x + 1, y, c);
        dfs(arr, x - 1, y, c);
        dfs(arr, x, y + 1, c);
        dfs(arr, x, y - 1, c);
    }
}
