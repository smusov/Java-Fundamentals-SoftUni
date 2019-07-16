import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snowballs {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        byte balls = Byte.parseByte(read.readLine());

        long bestBall = 0;
        int snowballSnowPrint =0;
        int snowballTimePrint =0;
        int snowballQualityPrint =0;

        for (int i = 0; i <balls ; i++) {

            int snowballSnow = Integer.parseInt(read.readLine());
            int snowballTime = Integer.parseInt(read.readLine());
            int snowballQuality = Integer.parseInt(read.readLine());

            long snowBallValue = (long) Math.pow(snowballSnow / snowballTime,snowballQuality);

            if (snowBallValue>bestBall){

                bestBall=snowBallValue;
                snowballSnowPrint =snowballSnow;
                snowballTimePrint =snowballTime;
                snowballQualityPrint=snowballQuality;
            }
        }

        System.out.println(String.format("%d : %d = %d (%d)",snowballSnowPrint,snowballTimePrint,bestBall,snowballQualityPrint));

    }
}
