package ch05.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFSBFS_1 {
    public static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = br.read() - '0';
            }
            br.read();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result += dfs(i, j);
            }
        }
        System.out.println(result);
    }

    public static int dfs(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length)
            return 0;
        if (map[x][y] == 0) {
            map[x][y] = 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y + 1);
            dfs(x, y - 1);
            return 1;
        }
        return 0;
    }
}
