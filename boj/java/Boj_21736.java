import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_21736 {
    public static char[][] map;
    public static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = (char)br.read();
                if (map[i][j] == 'I') {
                    x = i;
                    y = j;
                }
            }
            br.read();
        }

        dfs(x, y);

        if (cnt == 0)
            System.out.println("TT");
        else
            System.out.println(cnt);
    }

    public static void dfs(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length || map[x][y] == 'X') {
            return;
        }
        if (map[x][y] == 'P')
            cnt++;
        map[x][y] = 'X';
        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);
    }
}
