import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_9086 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            char[] str = br.readLine().toCharArray();
            sb.append(str[0]).append(str[str.length - 1]).append("\n");
        }

        System.out.println(sb);
    }
}
