import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiSumator {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();
        int[] emojiAscii = Arrays.stream(read.readLine().split(":+")).mapToInt(Integer::parseInt).toArray();

        String searchEmoji = encryptEmoji(emojiAscii);

        Pattern emojiPattern = Pattern.compile("(?<=[ ,.!?])(?<emoji>:[a-z]{4,}:)(?=[ ,.!?])");
        Matcher emojiMatcher = emojiPattern.matcher(input);

        int totalEmojiPower = 0;
        List<String> emoji = new ArrayList<>();

        while (emojiMatcher.find()){

            emoji.add(emojiMatcher.group("emoji"));
            String clearEmoji = emojiMatcher.group("emoji").replace(":","");

            for (int i = 0; i < clearEmoji.length(); i++) {
                totalEmojiPower+=clearEmoji.charAt(i);
            }
        }

        for (String element : emoji) {
            String clearEmoji = element.replace(":","");
            if (clearEmoji.equals(searchEmoji)){
                totalEmojiPower*=2;
                break;
            }
        }

        if (!emoji.isEmpty()){
            System.out.println("Emojis found: "+emoji.toString().replaceAll("[\\[\\]]",""));
        }

        System.out.println("Total Emoji Power: "+totalEmojiPower);

    }

    private static String encryptEmoji(int[] emojiAscii) {
        StringBuilder result = new StringBuilder();

        for (int num : emojiAscii) {
            result.append((char) num);
        }
        return result.toString();
    }
}
