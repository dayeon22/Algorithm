package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int lt = 1, rt = 1;
        int sum = 0, cnt = 0;

        while (rt < n) {
            if (sum < n) {
                sum += rt++;
            } else if (sum > n) {
                sum -= lt++;
            }
            if (sum == n) {
                cnt++;
                sum -= lt++;
            }
        }
        System.out.println(cnt);
    }
}
