import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> nameSet = new HashSet<>();
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nameSet.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (nameSet.contains(name))
                nameList.add(name);
        }

        System.out.println(nameList.size());
        Collections.sort(nameList);
        for (String name : nameList)
            System.out.println(name);
    }
}
