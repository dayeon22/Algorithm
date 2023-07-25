package sec01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            }
        }
        System.out.println(result);
    }
}
