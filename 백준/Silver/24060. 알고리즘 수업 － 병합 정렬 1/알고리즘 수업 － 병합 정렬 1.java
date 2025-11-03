import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static long K;               
    static int[] A, tmp;
    static long cnt = 0;         
    static int kth = -1;       
    static boolean found = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Long.parseLong(st.nextToken());

        A = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        mergeSort(0, N - 1);

        StringBuilder sb = new StringBuilder();
        sb.append(kth);
        System.out.print(sb);
    }

    static void mergeSort(int left, int right) {
        if (found) return; 
        if (left >= right) return;
        int mid = (left + right) >>> 1;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }

    static void merge(int left, int mid, int right) {
        if (found) return;

        int i = left, j = mid + 1, t = left;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else              tmp[t++] = A[j++];
        }
        while (i <= mid)  tmp[t++] = A[i++];
        while (j <= right) tmp[t++] = A[j++];

        for (int k = left; k <= right; k++) {
            A[k] = tmp[k];
            cnt++;
            if (!found && cnt == K) {
                kth = A[k];
                found = true; 
            }
        }
    }
}