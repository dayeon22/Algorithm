package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
public class Sol07 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toLowerCase().toCharArray();
        String result = "YES";

        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] != str[str.length - i - 1]) {
                result = "NO";
            }
        }
        System.out.println(result);
    }
}
