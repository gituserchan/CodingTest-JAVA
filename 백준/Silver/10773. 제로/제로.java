import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int count = 0;

    public static void input(int m) {
        arr[count++] = m;
    }

    public static void pop() {
        arr[--count] = 0;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        arr = new int[K];

        for (int i = 0; i < K; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money == 0) {
                pop();
            } else {
                input(money);
            }
        }

        long answer = 0; 
        for (int i = 0; i < K; i++) {
            answer += arr[i];
        }
        System.out.println(answer);
    }
}