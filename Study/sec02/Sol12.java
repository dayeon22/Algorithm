package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] scores = new int[m][n];
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) { // 기준 학생번호
            for (int j = 1; j <= n; j++) { // 비교할 학생 번호
                boolean flag = true;
                for (int k = 0; k < m; k++) { // 배열의 행
                    int pi = 0;
                    int pj = 0;

                    for (int l = 0; l < n; l++) { // 배열의 열
                        // 배열의 행열을 탐색하며 i/j번 학생을 찾으면 해당 학생의 등수를 구하여 저장
                        if (scores[k][l] == i)
                            pi = l; // l: 등수
                        if (scores[k][l] == j)
                            pj = l;
                    }
                    if (pi >= pj)
                        flag = false;
                }
                if (flag)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
