import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] queue = new int[N];
        int front = 0;
        int back = 0;

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("push")) {
                int x = Integer.parseInt(cmd.substring(5));
                queue[back++] = x;
            } 
            else if (cmd.equals("pop")) {
                if (front == back) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue[front++]).append('\n');
                }
            } 
            else if (cmd.equals("size")) {
                sb.append(back - front).append('\n');
            } 
            else if (cmd.equals("empty")) {
                sb.append((front == back) ? 1 : 0).append('\n');
            } 
            else if (cmd.equals("front")) {
                if (front == back) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue[front]).append('\n');
                }
            } 
            else if (cmd.equals("back")) {
                if (front == back) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue[back - 1]).append('\n');
                }
            }
        }

        System.out.print(sb.toString());
    }
}