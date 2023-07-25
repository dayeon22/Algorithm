package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol03 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split(" ");
        int max = 0;
        String result = "";

        for (String word : words) {
            int len = word.length();
            if (len > max) {
                max = len;
                result = word;
            }
        }
        System.out.println(result);
    }
}
