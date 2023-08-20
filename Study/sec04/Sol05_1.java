package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Sol05_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int x = j + 1; x < n; x++) {
                    tSet.add(arr[i] + arr[j] + arr[x]);
                }
            }
        }

        int i = 0;
        int result = -1;
        for (int num : tSet) {
            i++;
            if (i == k) {
                result = num;
                break;
            }
        }
        System.out.println(result);
    }
}
