import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> gradeToPoint = new HashMap<>();
        gradeToPoint.put("A+", 4.5);
        gradeToPoint.put("A0", 4.0);
        gradeToPoint.put("B+", 3.5);
        gradeToPoint.put("B0", 3.0);
        gradeToPoint.put("C+", 2.5);
        gradeToPoint.put("C0", 2.0);
        gradeToPoint.put("D+", 1.5);
        gradeToPoint.put("D0", 1.0);
        gradeToPoint.put("F",  0.0);
        

        double sumWeighted = 0.0; 
        double sumCredit   = 0.0; 

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();          
            double credit  = Double.parseDouble(st.nextToken()); 
            String grade   = st.nextToken();          

            if (grade.equals("P")) {
                continue;
            }

            Double point = gradeToPoint.get(grade);
            if (point != null) {
                sumWeighted += credit * point;
                sumCredit   += credit;
            }
        }

        double gpa = sumCredit == 0.0 ? 0.0 : sumWeighted / sumCredit;
        System.out.printf("%.6f%n", gpa);
    }
}