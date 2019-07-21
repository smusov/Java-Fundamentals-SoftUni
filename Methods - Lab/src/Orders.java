import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Orders {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();
        int quality = Integer.parseInt(read.readLine());

        switch (input){
            case "coffee":
                coffee(quality);
                break;
            case "water":
                water(quality);
                break;
            case "coke":
                coke(quality);
                break;
            case "snacks":
                snacks(quality);
                break;
        }
    }
    private static void coffee(int quality){
        System.out.println(String.format("%.2f",quality*1.50));
    }
    private static void water (int quality){
        System.out.printf("%.2f",quality*1.00);
    }
    private static void coke (int quality){
        System.out.printf("%.2f",quality*1.40);
    }
    private static void snacks (int quality){
        System.out.printf("%.2f",quality*2.00);

    }
}
