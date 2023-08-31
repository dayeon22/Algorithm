import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11659 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        int sum = arr[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += Integer.parseInt(st.nextToken());
            arr[i] = sum;
        }

        for (int tc = 0; tc < m; tc++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            sb.append(arr[end] - arr[start - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
