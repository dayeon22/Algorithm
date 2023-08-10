import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj_2667 {
    public static int[][] map;
    public static int houseCnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> house = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = br.read() - '0';
            }
            br.read();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                houseCnt = 0;
                if (dfs(i, j) == 1) {
                    cnt++;
                    house.add(houseCnt);
                }
            }
        }

        System.out.println(cnt);
        if (house.size() == 0)
            System.out.println(0);
        else {
            Collections.sort(house);
            for (int num : house)
                System.out.println(num);
        }
    }

    public static int dfs(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length)
            return 0;
        if (map[x][y] == 1) {
            map[x][y] = 0;
            houseCnt++;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return 1;
        }
        return 0;
    }
}
