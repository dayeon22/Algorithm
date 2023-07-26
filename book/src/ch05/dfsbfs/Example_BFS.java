package ch05.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Example_BFS {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 1번 노드와 연결된 노드
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 2번 노드와 연결된 노드
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 3번 노드와 연결된 노드
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 4번 노드와 연결된 노드
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 5번 노드와 연결된 노드
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 6번 노드와 연결된 노드
        graph.get(6).add(7);

        // 7번 노드와 연결된 노드
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 8번 노드와 연결된 노드
        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
    }

    // BFS: 너비 우선 탐색. 큐를 이용하여 구현할 수 있다.
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int x = q.poll(); // 큐에서 하나의 원소를 뽑음
            System.out.print(x + " ");

            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

}
