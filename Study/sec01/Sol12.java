package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 */
public class Sol12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String code = br.readLine();
        int ascii;

        for (int i = 0; i < n; i++) {
            ascii = 0;
            for (int j = 0; j < 7; j++) {
                if (code.charAt(i * 7 + j) == '#')
                    ascii += Math.pow(2, 6 - j);
            }
            System.out.print((char)ascii);
        }
    }
}
