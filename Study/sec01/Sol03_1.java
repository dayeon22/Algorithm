package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
