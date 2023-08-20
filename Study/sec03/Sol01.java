package sec03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, j = 0;

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        int[] newArr = new int[n + m];
        st = new StringTokenizer(br.readLine());
        for (i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        i = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                newArr[i + j] = arr1[i++];
            else
                newArr[i + j] = arr2[j++];
        }
        while (i < n) {
            newArr[i + j] = arr1[i++];
        }
        while (j < m) {
            newArr[i + j] = arr2[j++];
        }

        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
