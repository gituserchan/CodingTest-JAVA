import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> neverHeard = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }

        for (int j = 0; j < M; j++) {
            String name = br.readLine();
            if (neverHeard.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append('\n');
        for (String name : result) {
            sb.append(name).append('\n');
        }

        System.out.print(sb.toString());
    }
}