package sec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
첫번째 문자열의 요소를 map에 넣고, 두번째 문자열의 요소를 map에서 뺌
만약 빼기 전 개수가 0이라면 아나그램이 아님
두 문자의 길이가 같다는 조건이 있기 때문에 아나그램이 아니라면 무조건 map 요소의 개수가 음수가 됨
 */
public class Sol02_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        String result = "YES";

        for (char c : str1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str2) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                result = "NO";
                break;
            }
            map.put(c, map.get(c) - 1);
        }
        System.out.println(result);
    }
}
