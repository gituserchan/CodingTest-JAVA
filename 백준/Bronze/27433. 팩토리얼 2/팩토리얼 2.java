import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 1L;

        if (N == 0) {
            System.out.println(1);
            return; 
        }

        for (long i = 1; i <= N; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}