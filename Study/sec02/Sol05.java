package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n + 1];
        int cnt = 0;

        for (int i = 2; i * i <= n; i++) {
            if (numbers[i] == 1)
                continue;
            for (int j = 2 * i; j <= n; j += i) {
                numbers[j] = 1;
            }
        }

        for (int i = 2; i < n; i++) {
            if (numbers[i] == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
