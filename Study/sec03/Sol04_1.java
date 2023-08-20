package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol04_1 {
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

        int rt = 0, lt = 0;
        int cnt = 0, sum = 0;
        for (rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while (sum > m) {
                sum -= arr[lt++];
            }
            if (sum == m)
                cnt++;
        }
        System.out.println(cnt);
    }
}
