import java.io.*;
import java.util.*;

public class Main {
    static int[] stack;
    static int size = 0; 

    public static void push(int x) {
        stack[size++] = x;
    }

    public static int pop() {
        if (size == 0) return -1;
        return stack[--size];
    }

    public static int count() {
        return size;
    }

    public static int empty() {
        return size == 0 ? 1 : 0;
    }

    public static int top() {
        if (size == 0) return -1;
        return stack[size - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        stack = new int[N]; 

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            
            if (line.charAt(0) == '1') {
                int x = Integer.parseInt(line.substring(2));
                push(x);
            } else if (line.equals("2")) {
                sb.append(pop()).append('\n');
            } else if (line.equals("3")) {
                sb.append(count()).append('\n');
            } else if (line.equals("4")) {
                sb.append(empty()).append('\n');
            } else if (line.equals("5")) {
                sb.append(top()).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}