import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_25206 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double cSum = 0;
        double sSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            double score = toScore(st.nextToken());

            if (score != -1) {
                cSum += credit;
                sSum += credit * score;
            }
        }
        System.out.printf("%.6f", sSum / cSum);
    }

    public static double toScore(String score) {
        if (score.equals("A+"))
            return 4.5;
        else if (score.equals("A0"))
            return 4.0;
        else if (score.equals("B+"))
            return 3.5;
        else if (score.equals("B0"))
            return 3.0;
        else if (score.equals("C+"))
            return 2.5;
        else if (score.equals("C0"))
            return 2.0;
        else if (score.equals("D+"))
            return 1.5;
        else if (score.equals("D0"))
            return 1.0;
        else if (score.equals("F"))
            return 0;
        else
            return -1;
    }
}
