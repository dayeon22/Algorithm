package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol06_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int [n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int zeroCnt = 0, max = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0)
                zeroCnt++;
            while (zeroCnt > k) {
                if (arr[lt] == 0)
                    zeroCnt--;
                lt++;
            }
            max = Math.max(max, rt - lt + 1);
        }
        System.out.println(max);
    }
}
