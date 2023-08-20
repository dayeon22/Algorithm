package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sol02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();

        for (char c : str1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
