package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 각 단어는 공백으로 구분합니다.
 */
public class Sol03_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int spaceIdx;
        int maxLen = 0;
        String result = "";

        while ((spaceIdx = str.indexOf(' ')) != -1) {
            String word = str.substring(0, spaceIdx);
            int len = word.length();
            if (len > maxLen) {
                maxLen = len;
                result = word;
            }
            str = str.substring(spaceIdx + 1);
        }
        if (str.length() > maxLen)
            result = str;
        System.out.println(result);
    }
}
