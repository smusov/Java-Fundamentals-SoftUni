import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasterCozonacs {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(read.readLine());
        double floorForKG = Double.parseDouble(read.readLine());
        
        double eggsPrice = floorForKG*0.75;
        double milkPrice = floorForKG*1.25;

        double priceForOneCozonacs = eggsPrice+floorForKG+(milkPrice/4);

        int cosunacs = 0;
        int eggs = 0;

        while (budget>=priceForOneCozonacs){
            budget-=priceForOneCozonacs;
            cosunacs++;
            eggs+=3;
            if (cosunacs%3==0){
                eggs-=cosunacs-2;
            }
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",cosunacs,eggs,budget);
    }
}
