import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasSpirit {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int quality = Integer.parseInt(read.readLine());
        int days = Integer.parseInt(read.readLine());

        int money = 0;
        int spirit = 0;

        for (int i = 1; i <= days; i++) {
            if (i%11==0){
                quality+=2;
            }
            if (i%2==0){
                money+=quality*2;
                spirit+=5;
            }
            if (i%3==0){
                money+=quality*5;
                money+=quality*3;
                spirit+=13;
            }
            if (i%5==0){
                money+=quality*15;
                spirit+=17;
                if (i%3==0){
                    spirit+=30;
                }
            }
            if (i%10==0){
                spirit-=20;
                money+=23;
            }
            if (i%10==0&&days==i){
                spirit-=30;
            }
        }
        System.out.println("Total cost: "+money);
        System.out.println("Total spirit: "+spirit);
    }
}
