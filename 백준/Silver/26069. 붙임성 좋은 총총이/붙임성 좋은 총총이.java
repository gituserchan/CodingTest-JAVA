import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong");

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (a.equals("ChongChong") || b.equals("ChongChong")
                    || dancers.contains(a) || dancers.contains(b)) {
                dancers.add(a);
                dancers.add(b);
            }
        }

        System.out.println(dancers.size());
    }
}