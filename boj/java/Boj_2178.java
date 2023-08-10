import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2178 {
    public static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = br.read() - '0';
            }
            br.read();
        }

        bfs(0, 0);
        System.out.println(map[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});

        while (!q.isEmpty()) {
            int[] pq = q.poll();
            int px = pq[0];
            int py = pq[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length)
                    continue;
                if (map[nx][ny] == 1) {
                    map[nx][ny] = map[px][py] + 1;
                    q.offer(new int[] {nx, ny});
                }
            }
        }
    }
}
