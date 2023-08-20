package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sol02_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, j = 0;

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2);

        StringBuilder sb = new StringBuilder();
        i = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                sb.append(arr1[i] + " ");
                i++;
                j++;
            }
        }

        System.out.println(sb);
    }
}
