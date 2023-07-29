package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 */
public class Sol10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] s = st.nextToken().toCharArray();
        char t = st.nextToken().charAt(0);
        int[] len = new int[s.length];

        for (int i = 0; i < len.length; i++) {
            len[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i] == t) {
                for (int j = 0; j < s.length; j++) {
                    int l = Math.abs(i - j);
                    if (len[j] > l) {
                        len[j] = l;
                    }
                }
            }
        }
        for (int num : len) {
            System.out.print(num + " ");
        }
    }
}
