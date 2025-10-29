import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cap = N + 5;
        int[] q = new int[cap];
        int front = 0;
        int back = 0;

        for(int i = 1; i <= N; i++){
            q[back] = i;
            back = (back + 1) % cap;
        }

        while(true){
            int size = (back - front + cap) % cap;
            if(size == 1) break;

            front = (front + 1) % cap;

            int x = q[front];
            front = (front + 1) % cap;
            q[back] = x;
            back = (back + 1) % cap;
        }

        System.out.println(q[front]);
    }
}