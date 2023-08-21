import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            map1.put(input, i);
            map2.put(i, input);
        }
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if ('0' <= input.charAt(0) && input.charAt(0) <= '9') {
                sb.append(map2.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(map1.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
