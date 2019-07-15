import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class MonthPrinterOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] months = new String[]{"January", "February", "March",
                                       "April", "May", "June","July",
                                       "August", "September", "Octomber" ,
                                       "November", "December"};

        int input = Integer.parseInt(read.readLine());

        if (input>=1&&input<=12){

            System.out.println(months[input-1]);
        }else {

            System.out.println("Error!");
        }

    }
}
