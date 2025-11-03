import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }

        int a = 0; 
        int b = 1;  
        int sum = 0;

        for (int i = 2; i <= N; i++) {
            sum = a + b; 
            a = b;       
            b = sum;
        }

        System.out.println(sum);
    }
}