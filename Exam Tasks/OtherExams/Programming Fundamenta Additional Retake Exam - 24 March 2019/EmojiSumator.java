import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class EmojiSumator {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();
        List<Integer> ascii = Arrays.stream(read.readLine().split(":+")).map(Integer::parseInt).collect(Collectors.toList());

        int asciiSum = ascii.stream().reduce(Integer::sum).get();

        List<String> emoji = new ArrayList<>();

        Pattern pattern = Pattern.compile("(?<=[\\s])(?<emoji>:[a-z]{4,}:)(?=[\\s,.!?])");

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            emoji.add(matcher.group("emoji"));
        }
        int sum = 0;
        boolean isTrue = false;

        for (String s : emoji) {

            int insideSum = 0;

            String emojiClear = s.replaceAll(":+", "");

            for (int j = 0; j < emojiClear.length(); j++) {
                insideSum += emojiClear.charAt(j);
            }
            if (insideSum == asciiSum) {
                isTrue = true;
            }
            sum += insideSum;
        }
        if (isTrue){
            sum*=2;
        }
        if (emoji.size()>0){
            System.out.println("Emojis found: "+emoji.toString().replaceAll("[\\[\\]]",""));
            System.out.println("Total Emoji Power: "+sum);
        }else {
            System.out.println("Total Emoji Power: "+sum);
        }
    }
}