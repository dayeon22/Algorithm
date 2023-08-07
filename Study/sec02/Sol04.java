package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            sb.append(second).append(" ");
            int temp = second;
            second = first + second;
            first = temp;
        }
        System.out.println(sb);
    }
}
