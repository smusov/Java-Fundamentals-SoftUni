import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterOverflow {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        byte n = Byte.parseByte(read.readLine());

        short capacity = 255;
        int pourWater = 0;

        for (int i = 1; i <=n ; i++) {
            int water = Integer.parseInt(read.readLine());

            if (pourWater<=capacity){

                pourWater+=water;

                if (pourWater>capacity){
                    pourWater-=water;
                    System.out.println("Insufficient capacity!");
                }
            }
        }

        System.out.println(pourWater);

    }
}
