package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */
public class Sol04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] str = br.readLine().toCharArray();
            for (int j = 0; j < str.length / 2; j++) {
                char temp = str[j];
                str[j] = str[str.length - j - 1];
                str[str.length - j - 1] = temp;
            }
            System.out.println(str);
        }
    }
}
