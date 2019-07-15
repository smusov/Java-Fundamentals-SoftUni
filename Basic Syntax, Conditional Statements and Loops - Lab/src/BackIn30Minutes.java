import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackIn30Minutes {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int hours = Integer.parseInt(read.readLine());
        int minutes = Integer.parseInt(read.readLine());

        int addedMinutes = (60*hours)+minutes+30;

        int finalHours = addedMinutes/60;
        int finalMinutes = addedMinutes%60;


        if (finalHours==24){
            System.out.printf("0:%02d",finalMinutes);
        }else {
            System.out.printf("%d:%02d",finalHours,finalMinutes);
        }

    }
}
