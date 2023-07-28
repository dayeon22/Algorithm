package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 */
public class Sol08_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");
        String s2 = new StringBuilder(s1).reverse().toString();
        String result = "YES";
        
        if (!s1.equals(s2))
            result = "NO";
        System.out.println(result);
    }
}
