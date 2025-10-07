import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int n = 1;
        int sum = 0; 
        while (sum < X) { 
            sum += n; 
            n++; 
        }
        n--;               
        int prevSum = sum - n;       
        int offset = X - prevSum - 1; 

        int num, den;
        if (n % 2 == 1) {          
            num = n - offset;
            den = 1 + offset;
        } else {                   
            num = 1 + offset;
            den = n - offset;
        }

        System.out.println(num + "/" + den);
    }
}