import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            int result = 0;
            
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr1[mid] < arr2[i]) {
                    start = mid + 1;
                } else if (arr1[mid] > arr2[i]) {
                    end = mid - 1;
                } else {
                    result = 1;
                    break;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
