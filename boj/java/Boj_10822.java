import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_10822 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        String[] sNum = str.split(",");
        int result = 0;

        for (String s : sNum) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);
    }
}
