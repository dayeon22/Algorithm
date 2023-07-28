import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj_2164 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> deck = new LinkedList<>();
        for (int i = 2; i <= n; i += 2) {
            deck.add(i);
        }

        boolean isAdd = n % 2 == 1 ? true : false;
        int num = 1;
        while (true) {
            if (deck.isEmpty()) {
                System.out.println(num);
                break;
            }
            num = deck.remove();
            if (isAdd)
                deck.add(num);
            isAdd = !isAdd;
        }
    }
}