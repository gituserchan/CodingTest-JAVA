import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
        System.out.println(n * (n - 1) / 2); 
        System.out.println(2);              
    }
}