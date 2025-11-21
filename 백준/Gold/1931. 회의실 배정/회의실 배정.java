import java.io.*;
import java.util.*;

public class Main {
    static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Meeting[] arr = new Meeting[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[i] = new Meeting(s, e);
        }

        Arrays.sort(arr, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                if (m1.end == m2.end) {
                    return m1.start - m2.start;
                }
                return m1.end - m2.end;
            }
        });

        int count = 0;
        int lastEnd = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i].start >= lastEnd) {
                count++;
                lastEnd = arr[i].end;
            }
        }

        System.out.println(count);
    }
}