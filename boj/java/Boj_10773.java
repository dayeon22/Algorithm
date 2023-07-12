import java.util.Scanner;
import java.util.Stack;

public class Boj_10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < cnt; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int res = 0;
        for (int num : stack) {
            res += num;
        }
        System.out.println(res);
    }
}
