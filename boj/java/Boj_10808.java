import java.util.Scanner;

public class Boj_10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.nextLine().toCharArray();
        int[] arr = new int[26];

        for (char c : str) {
            arr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : arr)
            sb.append(n).append(" ");
        System.out.println(sb);
    }
}
