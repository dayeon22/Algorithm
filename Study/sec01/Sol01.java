package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
