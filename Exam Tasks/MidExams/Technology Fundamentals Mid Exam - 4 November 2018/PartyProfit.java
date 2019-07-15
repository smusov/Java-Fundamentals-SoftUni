import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartyProfit {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int partySize = Integer.parseInt(read.readLine());
        int days = Integer.parseInt(read.readLine());

        int coins = 0;

        for (int i = 1; i <= days; i++) {

            if (i%10==0){
                partySize-=2;
            }

            if (i%15==0){
                partySize+=5;
            }

            coins+=50;
            coins-=partySize*2;
            if (i%3==0){
                coins-=partySize*3;
            }
            if (i%5==0){
                coins+=partySize*20;
                if (i%3==0){
                    coins-=partySize*2;
                }
            }
        }
        System.out.printf("%d companions received %d coins each.",partySize,coins/partySize);
    }
}
