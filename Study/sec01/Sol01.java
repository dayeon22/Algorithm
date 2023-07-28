package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않으며 문자열의 길이는 100을 넘지 않습니다.
 */
public class Sol01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char c = br.readLine().toLowerCase().charAt(0);
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                cnt++;
        }
        System.out.println(cnt);
    }
}
