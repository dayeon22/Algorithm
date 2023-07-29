import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2606 {
    public static boolean[] visited;
    public static int[][] graph;
    public static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        visited = new boolean[node + 1];
        graph = new int[node + 1][node + 1];

        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            graph[n1][n2] = graph[n2][n1] = 1;
        }

        dfs(1);
        System.out.println(cnt);
    }

    public static void dfs(int x) {
        visited[x] = true;

        for (int i = 0; i < graph.length; i++) {
            if (graph[x][i] == 1 && !visited[i]) {
                cnt++;
                dfs(i);
            }
        }
    }
}
