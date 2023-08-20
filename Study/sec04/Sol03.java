package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Sol03 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> saleMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            saleMap.put(arr[rt], saleMap.getOrDefault(arr[rt], 0) + 1);
            if (rt >= k) {
                int num = saleMap.get(arr[lt]);
                if (num == 1)
                    saleMap.remove(arr[lt]);
                else
                    saleMap.put(arr[lt], saleMap.get(arr[lt]) - 1);
                lt++;
            }
            if (rt >= k - 1)
                sb.append(saleMap.size()).append(" ");
        }
        System.out.println(sb);
    }
}
