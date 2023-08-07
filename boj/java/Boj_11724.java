import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11724 {
    public static int[][] map;
    public static boolean[] visited;

    public static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            map[n1][n2] = map[n2][n1] = 1;
        }

        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == false) {
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i < visited.length; i++) {
            if (map[start][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }
}
