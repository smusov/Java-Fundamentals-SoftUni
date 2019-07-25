import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleOfManTTRace {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        Pattern pattern = Pattern.compile("(?<all>([#$%*&])(?<name>[A-Za-z]+)\\2=(?<geohashLength>[\\d]+)!!(?<geohash>.+))");

        while(true){

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                int length = Integer.parseInt(matcher.group("geohashLength"));
                String geohash = matcher.group("geohash");

                if (length==geohash.length()){
                   String encrypted = encryptGeohash(geohash);
                    System.out.println("Coordinates found! "+matcher.group("name")+" -> "+encrypted);
                    return;
                }else {
                    System.out.println("Nothing found!");
                }
            }else {
                System.out.println("Nothing found!");
            }

            input = read.readLine();
        }

    }

    private static String encryptGeohash(String geohash) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < geohash.length(); i++) {
            int newChar = geohash.charAt(i)+geohash.length();
            result.append((char)newChar);
        }
        return result.toString();
    }
}
