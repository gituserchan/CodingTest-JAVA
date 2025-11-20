import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int len = S.length();
        int[][] prefix = new int[26][len + 1];

        for (int i = 0; i < len; i++) {
            int ch = S.charAt(i) - 'a';
            for (int k = 0; k < 26; k++) {
                prefix[k][i + 1] = prefix[k][i];
            }
            prefix[ch][i + 1]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int lt = Integer.parseInt(st.nextToken());
            int rt = Integer.parseInt(st.nextToken());

            int idx = c - 'a';
            int answer = prefix[idx][rt + 1] - prefix[idx][lt];
            sb.append(answer).append('\n');
        }

        System.out.print(sb.toString());
    }
}