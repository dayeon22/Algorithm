package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] classes = new int[n][5];
        int cnt, max = 0, result = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}
