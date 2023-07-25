package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol04_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String tmp = new StringBuilder(br.readLine()).reverse().toString();
            System.out.println(tmp);
        }
    }
}
