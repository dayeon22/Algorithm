package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol07 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int score = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int mark = Integer.parseInt(st.nextToken());
            if (mark == 0) {
                score = 0;
            } else {
                score++;
                result += score;
            }
        }
        System.out.println(result);
    }
}
