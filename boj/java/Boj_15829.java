import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] str = br.readLine().toCharArray();
        long result = 0;
        long r = 1;

        for (int i = 0; i < str.length; i++) {
            result = (result + (str[i] - 'a' + 1) * r) % 1234567891;
            r = r * 31 % 1234567891;
        }
        System.out.println(result % 1234567891);
    }
}
