import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int cap = 2 * N + 5;
        int[] dq = new int[cap];
        int head = N, tail = N;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case 1: {
                    int x = Integer.parseInt(st.nextToken());
                    dq[--head] = x;
                    break;
                }
                case 2: {
                    int x = Integer.parseInt(st.nextToken());
                    dq[tail++] = x;
                    break;
                }
                case 3: {
                    if (head == tail) sb.append(-1).append('\n');
                    else sb.append(dq[head++]).append('\n');
                    break;
                }
                case 4: {
                    if (head == tail) sb.append(-1).append('\n');
                    else sb.append(dq[--tail]).append('\n');
                    break;
                }
                case 5: {
                    sb.append(tail - head).append('\n');
                    break;
                }
                case 6: {
                    sb.append(head == tail ? 1 : 0).append('\n');
                    break;
                }
                case 7: {
                    if (head == tail) sb.append(-1).append('\n');
                    else sb.append(dq[head]).append('\n');
                    break;
                }
                case 8: {
                    if (head == tail) sb.append(-1).append('\n');
                    else sb.append(dq[tail - 1]).append('\n');
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}