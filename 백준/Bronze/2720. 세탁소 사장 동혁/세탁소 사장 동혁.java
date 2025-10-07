import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int arr[] = new int[T];
        
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < T; i++) {
            int quarter = arr[i] / 25;
            int remain = arr[i] % 25;
            
            int dime = remain / 10;
            remain %= 10;
            
            int nickel = remain / 5;
            remain %= 5;
            
            int penny = remain;
            
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}