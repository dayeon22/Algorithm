import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11728 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int i = 0, j = 0;

        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        i = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                sb.append(arr1[i++]).append(" ");
            else
                sb.append(arr2[j++]).append(" ");
        }
        while (i < n) {
            sb.append(arr1[i++]).append(" ");
        }
        while (j < m) {
            sb.append(arr2[j++]).append(" ");
        }

        System.out.println(sb);
    }
}
