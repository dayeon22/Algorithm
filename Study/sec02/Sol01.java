package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int before = Integer.parseInt(st.nextToken());

        sb.append(before).append(" ");
        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (before < num) {
                sb.append(num).append(" ");
            }
            before = num;
        }
        System.out.println(sb);
    }
}
