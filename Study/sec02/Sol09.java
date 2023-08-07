package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol09 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        int max = 0;
        int xSum1 = 0;
        int xSum2 = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            int hSum = 0;
            int vSum = 0;
            for (int j = 0; j < n; j++) {
                hSum += arr[i][j];
                vSum += arr[j][i];
                if (i == j)
                    xSum1 += arr[i][j];
                if (i + j == n - 1)
                    xSum2 += arr[i][j];
            }
            // xSum1 += arr[i][i];
            // xSum2 += arr[i][n - i - 1];
            max = Math.max(max, hSum);
            max = Math.max(max, vSum);
        }
        max = Math.max(max, xSum1);
        max = Math.max(max, xSum2);

        System.out.println(max);
    }
}
