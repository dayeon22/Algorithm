package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 각 단어는 공백으로 구분합니다.
 */
public class Sol03 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split(" ");
        int max = 0;
        String result = "";

        for (String word : words) {
            int len = word.length();
            if (len > max) {
                max = len;
                result = word;
            }
        }
        System.out.println(result);
    }
}
