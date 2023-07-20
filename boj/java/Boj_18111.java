import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_18111 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] blocks = new int[n][m];
        int max, min, sec, invBlock;

        max = 0;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                blocks[i][j] = Integer.parseInt(st.nextToken());
                if (max < blocks[i][j]) {
                    max = blocks[i][j];
                }
                if (min > blocks[i][j]) {
                    min = blocks[i][j];
                }
            }
        }

        int resultHeight = 0;
        int resultSecond = Integer.MAX_VALUE;
        while (max >= min) {
            sec = 0;
            invBlock = b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int diff = max - blocks[i][j];
                    if (diff < 0) {
                        sec += (diff * -1) * 2;
                        invBlock += diff * -1;
                    } else {
                        sec += diff;
                        invBlock -= diff;
                    }
                }
            }
            if (invBlock >= 0 && sec < resultSecond) {
                resultHeight = max;
                resultSecond = sec;
            }
            max--;
        }
        System.out.println(resultSecond + " " + resultHeight);
    }
}
