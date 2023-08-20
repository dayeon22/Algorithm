package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
[연속된 수의 합이 15가 되는 개수를 구하는 방법(수학)]
1. 연속되는 2개의 수의 합이 15가 되는지 확인한다.
    x + y = 15
    x가 1을 할당하고, y에 2를 할당한다.
    15에 (x + y)를 빼고 2로 나누면 6으로 나누어 떨어진다.
    (1 + 6) + (2 + 6) = 15
2. 연속되는 3개의 수의 합이 15가 되는지 확인한다.
    x + y + z = 15
    x에 1을, y에 2를, z에 3을 할당한다.
    15에 (x + y + z)를 빼고 3으로 나누면 3으로 나누어 떨어진다.
    (1 + 3) + (2 + 3) + (3 + 3) = 15
...
 */
public class Sol05_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0, minus = 1;

        n -= minus;
        while (n > 0) {
            minus++;
            n -= minus;
            if (n % minus == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
