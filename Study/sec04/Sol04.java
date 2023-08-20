package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sol04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int cnt = 0;

        for (char c : t) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        int lt = 0;
        for (int rt = 0; rt < s.length; rt++) {
            map1.put(s[rt], map1.getOrDefault(s[rt], 0) + 1);
            if (rt >= t.length - 1) {
                if (map1.equals(map2))
                    cnt++;
                if (map1.get(s[lt]) == 1)
                    map1.remove(s[lt]);
                else
                    map1.put(s[lt], map1.get(s[lt]) - 1);
                lt++;
            }
        }
        System.out.println(cnt);
    }
}
