import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DungeonestDark {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int heart = 100;
        int coins = 0;
        List<String>input = Arrays.stream(read.readLine().split("[|]+")).collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {

            String[] data = input.get(i).split("\\s+");
            int num = Integer.parseInt(data[1]);
            switch (data[0]){
                case "potion":
                    heart=addHeart(heart,num);
                    break;
                case "chest":
                    coins+=num;
                    System.out.println(String.format("You found %s coins.",data[1]));
                    break;
                    default:
                        heart-=num;
                        if (heart>0){
                            System.out.println(String.format("You slayed %s.",data[0]));
                        }else {
                            System.out.println(String.format("You died! Killed by %s.",data[0]));
                            System.out.println(String.format("Best room: %d",i+1));
                            return;
                        }
                        break;
            }
        }
            System.out.println("You've made it!");
            System.out.printf("Coins: %d\n",coins);
            System.out.printf("Health: %d",heart);
    }

    private static int addHeart(int heart, int plusHeart) {

        if (heart<100){
            if (heart+plusHeart<=100){
                heart+=plusHeart;
                System.out.println(String.format("You healed for %d hp.",plusHeart));
                System.out.println(String.format("Current health: %d hp.",heart));
            }else {
                System.out.println(String.format("You healed for %d hp.",100-heart));
                heart=100;
                System.out.println("Current health: 100 hp.");
            }
        }else {
            System.out.println("You healed for 0 hp.");
            System.out.println("Current health: 100 hp.");
        }
        return heart;
    }
}
