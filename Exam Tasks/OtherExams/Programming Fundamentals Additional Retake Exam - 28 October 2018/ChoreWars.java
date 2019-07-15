import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChoreWars {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        String regex = "<([a-z\\d]+)>|\\[([A-Z\\d]+)]|\\{(?<=\\{).+(?=})}";

        Pattern pattern = Pattern.compile(regex);

        int dishes = 0;
        int house = 0;
        int laundry = 0;

        while (!"wife is happy".equals(input = read.readLine())) {
            Matcher matcher = pattern.matcher(input);
            String type = "";

            if (matcher.find()) {
                type = matcher.group();
            }

            if (!type.equals("")) {
                Pattern nums = Pattern.compile("[0-9]+");
                Matcher numsMatch = nums.matcher(type);

                StringBuilder numsInside = new StringBuilder();

                while (numsMatch.find()) {
                    numsInside.append(Integer.parseInt(numsMatch.group()));
                }

                int sum =Arrays.stream(numsInside.toString().split("")).mapToInt(Integer::parseInt).sum();

                switch (type.charAt(0)) {
                    case '<':
                        dishes += sum;
                        break;
                    case '[':
                        house += sum;
                        break;
                    case '{':
                        laundry += sum;
                        break;
                }
            }
        }
        System.out.printf("Doing the dishes - %d min.\n",dishes);
        System.out.printf("Cleaning the house - %d min.\n",house);
        System.out.printf("Doing the laundry - %d min.\n",laundry);
        System.out.printf("Total - %d min.",dishes+laundry+house);
    }
}
