package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Sol05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];
        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                for (int x = 0; x < n; x++) {
                    if (i == x || j == x)
                        continue;
                    set.add(arr[i] + arr[j] + arr[x]);
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int i = 0;
        int result = -1;
        for (int num : list) {
            i++;
            if (i == k) {
                result = num;
                break;
            }
        }
        System.out.println(result);
    }
}
