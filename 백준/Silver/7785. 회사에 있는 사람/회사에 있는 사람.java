import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            map.put(name, status);
        }
        
        ArrayList<String> list = new ArrayList<>();
        for (String name : map.keySet()) {
            if (map.get(name).equals("enter")) {
                list.add(name);
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String name : list) {
            sb.append(name).append("\n");
        }
        
        System.out.print(sb);
    }
}