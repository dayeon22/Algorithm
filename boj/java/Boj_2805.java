import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int end = 0, start = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (end < arr[i])
                end = arr[i];
        }

        while (start + 1 < end) {
            int mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (mid < arr[i])
                    sum += arr[i] - mid;
            }
            if (sum >= m)
                start = mid;
            else
                end = mid;
        }
        System.out.println(start);
    }
}
