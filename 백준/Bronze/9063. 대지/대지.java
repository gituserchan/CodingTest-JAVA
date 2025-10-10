import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }
        
        int xmin = arr[0][0];
        int ymin = arr[0][1];
        int xmax = arr[0][0];
        int ymax = arr[0][1];
        
        for (int i = 1; i < N; i++) {
            if (xmin > arr[i][0]) xmin = arr[i][0];
            if (xmax < arr[i][0]) xmax = arr[i][0];
            if (ymin > arr[i][1]) ymin = arr[i][1];
            if (ymax < arr[i][1]) ymax = arr[i][1];
        }
        
        System.out.println((xmax - xmin) * (ymax - ymin));
    }
}