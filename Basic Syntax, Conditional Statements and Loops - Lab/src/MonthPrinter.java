import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int mount = Integer.parseInt(read.readLine());

        String output="";

        if (mount>=1&&mount<=12){
            switch (mount){
                case 1 :
                    output="January";
                    break;
                case 2:
                    output = "February";
                    break;
                case 3:
                    output = "March";
                    break;
                case 4:
                    output = "April";
                    break;
                case 5:
                    output = "May";
                    break;
                case 6:
                    output = "June";
                    break;
                case 7:
                    output = "July";
                    break;
                case 8:
                    output = "August";
                    break;
                case 9:
                    output = "September";
                    break;
                case 10:
                    output = "Octomber";
                    break;
                case 11:
                    output = "November";
                    break;
                case 12:
                    output = "December";
                    break;
            }
            System.out.println(output);
        }else {
            System.out.println("Error!");
        }
    }
}
