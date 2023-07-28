import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_4949 {
    public static void main(String[] args) throws Exception {
        Stack<Character> stack;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        while (!str.equals(".")) {
            stack = new Stack();
            boolean wrong = false;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty() || stack.pop() != '(') {
                        wrong = true;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.pop() != '[') {
                        wrong = true;
                        break;
                    }
                }
            }
            if (str.length() <= 100 && str.charAt(str.length() - 1) == '.' && !wrong && stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            str = br.readLine();
        }
    }
}
