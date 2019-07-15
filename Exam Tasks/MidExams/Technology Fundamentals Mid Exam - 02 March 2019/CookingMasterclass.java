import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class CookingMasterclass {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(read.readLine());
        int students = Integer.parseInt(read.readLine());
        double priceForFlour = Double.parseDouble(read.readLine());
        double priceForEgg = Double.parseDouble(read.readLine());
        double priceForApron = Double.parseDouble(read.readLine());

        double otherApron = Math.ceil((students*20)/100.0);
        int freeFlour = students/5;

        double total = ((students-freeFlour)*priceForFlour)+
                ((students*10)*priceForEgg)+
                ((students+otherApron)*priceForApron);

        if (total<=budget){
            System.out.printf("Items purchased for %.2f$.",total);
        }else {
            System.out.printf("%.2f$ more needed.",total-budget);
        }
    }
}
