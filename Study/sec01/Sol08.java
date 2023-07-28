package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 */
public class Sol08 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        int lt = 0, rt = str.length() - 1;
        String result = "YES";

        while (lt < rt) {
            if (!Character.isAlphabetic(str.charAt(lt)))
                lt++;
            if (!Character.isAlphabetic(str.charAt(rt)))
                rt--;
            if (Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))) {
                if (str.charAt(lt) != str.charAt(rt)) {
                    result = "NO";
                    break;
                }
                lt++;
                rt--;
            }
        }
        System.out.println(result);
    }
}
