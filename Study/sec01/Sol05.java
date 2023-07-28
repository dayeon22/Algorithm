package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class Sol05 {
    public static boolean isAlpha(char c) {
        return (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z'));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int lt = 0;
        int rt = str.length - 1;

        while (lt < rt) {
            if (!isAlpha(str[lt])) lt++;
            if (!isAlpha(str[rt])) rt--;
            if (isAlpha(str[lt]) && isAlpha(str[rt])) {
                char temp = str[lt];
                str[lt++] = str[rt];
                str[rt--] = temp;
            }
        }
        System.out.println(str);
    }
}
