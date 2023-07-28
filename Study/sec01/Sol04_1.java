package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */
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
