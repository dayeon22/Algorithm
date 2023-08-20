package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int[] cnt = new int[5];

        for (int i = 0; i < n; i++) {
            cnt[str[i] - 'A']++;
        }

        int max = 0;
        char result = 'A';
        for (int i = 0; i < 5; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                result = (char)(i + 'A');
            }
        }
        System.out.println(result);
    }
}
