import java.io.*;

public class Boj_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        int i;

        for (i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (i = 0; i < 10001; i++) {
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        System.out.print(sb);
    }
}
