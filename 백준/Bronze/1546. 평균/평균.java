import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        double[] score = new double[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        
        double max = 0;
        for (int j = 0; j < N; j++) {
            if (score[j] > max) {
                max = score[j];
            }
        }
        
        double sum = 0;
        for (int t = 0; t < N; t++) {
            sum += (score[t] / max * 100.0);
        }
        
        double result = sum / N;
        bw.write(result + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}