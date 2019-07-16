import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeerKegs {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        byte n = Byte.parseByte(read.readLine());

        double bigKegVolume =0.0;
        String bigKeg = "";

        for (int i = 0; i <n; i++) {

            String model = read.readLine();
            double radius = Double.parseDouble(read.readLine());
            int height = Integer.parseInt(read.readLine());

            double volume = Math.PI* Math.pow(2,radius)*height;

            if (volume>bigKegVolume){
                bigKegVolume=volume;
                bigKeg=model;
            }

        }

        System.out.println(bigKeg);

    }
}
