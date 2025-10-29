import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] rowNeed;
    static int[] colNeed;
    static int[][] board;

    static class Dinic {
        int MAXV;
        int[] head;
        int[] to;
        int[] cap;
        int[] next;
        int edgeCount;
        int[] level;
        int[] it;

        Dinic(int V, int maxEdges){
            MAXV = V;
            head = new int[V];
            Arrays.fill(head, -1);
            to = new int[maxEdges];
            cap = new int[maxEdges];
            next = new int[maxEdges];
            edgeCount = 0;
            level = new int[V];
            it = new int[V];
        }

        void addEdge(int u, int v, int c){
            to[edgeCount] = v;
            cap[edgeCount] = c;
            next[edgeCount] = head[u];
            head[u] = edgeCount++;
            to[edgeCount] = u;
            cap[edgeCount] = 0;
            next[edgeCount] = head[v];
            head[v] = edgeCount++;
        }

        boolean bfs(int s, int t){
            Arrays.fill(level, -1);
            ArrayDeque<Integer> q = new ArrayDeque<>();
            level[s] = 0;
            q.add(s);
            while(!q.isEmpty()){
                int v = q.poll();
                for(int e = head[v]; e != -1; e = next[e]){
                    if(cap[e] > 0){
                        int w = to[e];
                        if(level[w] < 0){
                            level[w] = level[v] + 1;
                            q.add(w);
                        }
                    }
                }
            }
            return level[t] >= 0;
        }

        int dfs(int v, int t, int f){
            if(v == t) return f;
            for(int ePos = it[v]; ePos != -1; ePos = next[ePos], it[v] = ePos){
                int e = ePos;
                int w = to[e];
                if(cap[e] > 0 && level[w] == level[v] + 1){
                    int pushed = dfs(w, t, Math.min(f, cap[e]));
                    if(pushed > 0){
                        cap[e] -= pushed;
                        cap[e ^ 1] += pushed;
                        return pushed;
                    }
                }
            }
            return 0;
        }

        int maxFlow(int s, int t){
            int flow = 0;
            while(bfs(s, t)){
                for(int i = 0; i < MAXV; i++) it[i] = head[i];
                while(true){
                    int pushed = dfs(s, t, 1_000_000_000);
                    if(pushed == 0) break;
                    flow += pushed;
                }
            }
            return flow;
        }
    }

    static boolean feasible() {
        int[] rRem = new int[N];
        int[] cRem = new int[M];
        int sumR = 0, sumC = 0;
        for(int i = 0; i < N; i++){
            rRem[i] = rowNeed[i];
            if(rRem[i] < 0) return false;
            sumR += rRem[i];
        }
        for(int j = 0; j < M; j++){
            cRem[j] = colNeed[j];
            if(cRem[j] < 0) return false;
            sumC += cRem[j];
        }
        if(sumR != sumC) return false;

        int S = 0;
        int rowStart = 1;
        int colStart = 1 + N;
        int T = colStart + M;
        int maxEdges = (N + (N * M) + M) * 2 + 5;

        Dinic din = new Dinic(T + 1, maxEdges);

        for(int i = 0; i < N; i++){
            if(rRem[i] > 0) din.addEdge(S, rowStart + i, rRem[i]);
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(board[i][j] == -1) din.addEdge(rowStart + i, colStart + j, 1);
            }
        }
        for(int j = 0; j < M; j++){
            if(cRem[j] > 0) din.addEdge(colStart + j, T, cRem[j]);
        }

        int flow = din.maxFlow(S, T);
        return flow == sumR;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        rowNeed = new int[N];
        colNeed = new int[M];
        st = new StringTokenizer(br.readLine());
        int sumRow = 0;
        for(int i = 0; i < N; i++){
            rowNeed[i] = Integer.parseInt(st.nextToken());
            sumRow += rowNeed[i];
        }
        st = new StringTokenizer(br.readLine());
        int sumCol = 0;
        for(int j = 0; j < M; j++){
            colNeed[j] = Integer.parseInt(st.nextToken());
            sumCol += colNeed[j];
        }
        if(sumRow != sumCol){
            System.out.println(-1);
            return;
        }
        board = new int[N][M];
        for(int i = 0; i < N; i++) Arrays.fill(board[i], -1);
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                board[i][j] = 0;
                if(!feasible()){
                    board[i][j] = 1;
                    rowNeed[i]--;
                    colNeed[j]--;
                    if(rowNeed[i] < 0 || colNeed[j] < 0){
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        for(int i = 0; i < N; i++){
            if(rowNeed[i] != 0){
                System.out.println(-1);
                return;
            }
        }
        for(int j = 0; j < M; j++){
            if(colNeed[j] != 0){
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) sb.append(board[i][j]);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}