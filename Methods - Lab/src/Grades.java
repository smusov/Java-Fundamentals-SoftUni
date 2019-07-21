import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grades {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double grade = Double.parseDouble(read.readLine());
        checkGrade(grade);

    }
    private static void checkGrade (double grade ){
        if (grade<=2.99){
            System.out.println("Fail");
        }else if (grade<=3.49){
            System.out.println("Poor");
        }else if (grade<=4.49){
            System.out.println("Good");
        }else if (grade<=5.49){
            System.out.println("Very good");
        }else {
            System.out.println("Excellent");
        }

    }
}
