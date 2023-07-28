package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class Sol06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (!list.contains(str[i]))
                list.add(str[i]);
        }
        for (char c : list)
            System.out.print(c);
    }
}
