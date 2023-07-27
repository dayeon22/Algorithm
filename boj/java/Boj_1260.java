import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1260 {
    public static int[][] graph;
    public static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수
        int v = Integer.parseInt(st.nextToken()); // 탐색 시작 번호
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            graph[n1][n2] = 1;
            graph[n2][n1] = 1;
        }

        dfs(v);
        visited = new boolean[n + 1];
        System.out.println();
        bfs(v);
    }

    public static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");

            for(int i = 0; i < graph.length; i++) {
                if (graph[x][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
