package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sol01_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char result = 'A';
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }
        System.out.println(result);
    }
}
