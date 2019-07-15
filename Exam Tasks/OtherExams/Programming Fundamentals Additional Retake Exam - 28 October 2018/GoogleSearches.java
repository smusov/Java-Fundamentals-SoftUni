import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoogleSearches {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int totalDays = Integer.parseInt(read.readLine());
        int users = Integer.parseInt(read.readLine());
        double moneyForOneSearch = Double.parseDouble(read.readLine());

        double total = 0;

        for (int i = 1; i <= users; i++) {
            int numWord = Integer.parseInt(read.readLine());
            double moneyPerUser = 0;
            if (numWord == 1) {
                moneyPerUser = moneyForOneSearch*2;
            }
            if (numWord>1&&numWord<=5){
                moneyPerUser=moneyForOneSearch;
            }
            if (i%3==0){
                moneyPerUser*=3;
            }
            total+=moneyPerUser;
        }
        System.out.printf("Total money earned for %d days: %.2f",totalDays,total*totalDays);
    }
}
