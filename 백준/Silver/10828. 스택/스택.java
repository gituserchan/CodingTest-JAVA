import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] stack = new int[N]; 
        int top = -1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            char c0 = cmd.charAt(0);
            if (c0 == 'p') {
                if (cmd.charAt(1) == 'u') { 
                    int x = Integer.parseInt(cmd.substring(5));
                    stack[++top] = x;
                } else {
                    if (top == -1) sb.append(-1).append('\n');
                    else sb.append(stack[top--]).append('\n');
                }
            } else if (c0 == 's') {
                sb.append(top + 1).append('\n');
            } else if (c0 == 'e') { 
                sb.append(top == -1 ? 1 : 0).append('\n');
            } else { 
                if (top == -1) sb.append(-1).append('\n');
                else sb.append(stack[top]).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}