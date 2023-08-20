package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol03_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < m; i++)
            sum += arr[i];

        int max = sum;
        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i - m]); // arr[i]를 더하고 arr[i - m]을 뺀다.
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
