import java.util.Scanner;

public class Boj_1541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        first(input);
        second(input);
    }

    public static void first(String input) {
        int flag = 0;
        int start = 0;
        int num = 0;
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                num = Integer.parseInt(input.substring(start, i));
                start = i + 1;
                if (flag == 0)
                    result += num;
                else
                    result -= num;
            }
            if (input.charAt(i) == '-')
                flag = 1;
        }
        num = Integer.parseInt(input.substring(start));
        if (flag == 0)
            result += num;
        else
            result -= num;
        System.out.println(result);
    }

    public static void second(String input) {
        int idx = input.indexOf("-");
        String[] plusArr;
        String[] minusArr;
        int result = 0;

        if (idx < 0) {
            plusArr = input.split("\\+");
        } else {
            plusArr = input.substring(0, idx).split("\\+|-");
            minusArr = input.substring(idx + 1).split("\\+|-");
            for (int i = 0; i < minusArr.length; i++) {
                result -= Integer.parseInt(minusArr[i]);
            }
        }
        for (int i = 0; i < plusArr.length; i++) {
            result += Integer.parseInt(plusArr[i]);
        }
        System.out.println(result);
    }
}
