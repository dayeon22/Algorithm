import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            int j = 0;
            while (j < input.length())
                arr[i][j] = input.charAt(j++);
            while (j < 15)
                arr[i][j++] = 0;
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != 0)
                    sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}
