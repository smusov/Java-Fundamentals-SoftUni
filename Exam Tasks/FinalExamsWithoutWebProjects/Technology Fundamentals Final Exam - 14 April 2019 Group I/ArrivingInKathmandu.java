import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Pattern pattern = Pattern.compile("^(?<name>[A-Za-z!@#?$\\d]+)=(?=[\\d])(?<lenght>[\\d]+)<<(?<geohash>.+)$");
        Pattern letters = Pattern.compile("(?<name>[A-Za-z]+)");

        while(!"Last note".equals(input=read.readLine())){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                int lenght = Integer.parseInt(matcher.group("lenght"));
                String geohash = matcher.group("geohash");

                if (lenght==geohash.length()){
                    Matcher matcher1 = letters.matcher(matcher.group("name"));
                    StringBuilder name = new StringBuilder();
                    while (matcher1.find()){
                        name.append(matcher1.group("name"));
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s",name,geohash));
                }else {
                    System.out.println("Nothing found!");
                }


            }else {
                System.out.println("Nothing found!");
            }

        }

    }
}
