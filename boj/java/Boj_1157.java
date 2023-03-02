import java.util.Scanner;

public class Boj_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[26];
        char[] str = scanner.nextLine().toCharArray();
        int max = 0, maxIdx = 0, cnt = 0;

        for (int i = 0; i < str.length; i++) {
            int idx = 0;
            if ('A' <= str[i] && str[i] <= 'Z')
                idx = str[i] - 'A';
            else if ('a' <= str[i] && str[i] <= 'z')
                idx = str[i] - 'a';
            counts[idx]++;
            if (max < counts[idx]) {
                max = counts[idx];
                maxIdx = idx;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (counts[i] == max) {
                cnt++;
            }
        }
        if (cnt == 1)
            System.out.println((char)(maxIdx + 'A'));
        else
            System.out.println('?');
    }
}
