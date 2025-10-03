import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String aRev = new StringBuilder(a).reverse().toString();
        String bRev = new StringBuilder(b).reverse().toString();

        int A = Integer.parseInt(aRev);
        int B = Integer.parseInt(bRev);

        System.out.println(Math.max(A, B));
    }
}