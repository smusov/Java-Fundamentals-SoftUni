import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiceMustFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int yield = Integer.parseInt(read.readLine());

        int spice = 0;
        int days = 0;

        while (yield >= 100) {
            spice += yield;
            yield -= 10;

            spice -= 26;

            days++;
        }
        System.out.println(days);
        if (spice >= 26) {
            System.out.println(spice - 26);
        } else {
            System.out.println(spice);
        }

    }
}
