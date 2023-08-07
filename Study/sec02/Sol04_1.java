package sec02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol04_1 {
    public static int n;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        fibo(0, 1);
        System.out.println(sb);
    }

    public static int fibo(int first, int second) {
        sb.append(second).append(" ");
        n--;
        if (n <= 0)
            return second;
        return fibo(second, first + second);
    }
}
