import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double numberPeople = Integer.parseInt(read.readLine());
        double capacity = Integer.parseInt(read.readLine());

        double a = Math.ceil(numberPeople/capacity);

        if (numberPeople<capacity){
            System.out.println(1);
        }else{
            System.out.println(String.format("%.0f",a));
        }

    }
}
