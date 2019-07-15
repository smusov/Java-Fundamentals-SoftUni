import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheatrePromotions {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String day = read.readLine();
        int age = Integer.parseInt(read.readLine());

        String price ;

        if (age>=0&&age<=18){
            switch (day){
                case "Weekday":
                    price = "12$";
                    break;
                case "Weekend":
                    price = "15$";
                    break;
                case "Holiday":
                    price = "5$";
                    break;
                default:
                    price = "Error!";
                    break;
            }
        }else if (age>18&&age<=64){
            switch (day){
                case "Weekday":
                    price = "18$";
                    break;
                case "Weekend":
                    price = "20$";
                    break;
                case "Holiday":
                    price = "12$";
                    break;
                default:
                    price = "Error!";
                    break;
            }
        }else if (age>64&&age<=122){
            switch (day){
                case "Weekday":
                    price = "12$";
                    break;
                case "Weekend":
                    price = "15$";
                    break;
                case "Holiday":
                    price = "10$";
                    break;
                default:
                    price = "Error!";
                    break;
            }
        }else {
            price = "Error!";
        }
        System.out.println(price);

    }
}
