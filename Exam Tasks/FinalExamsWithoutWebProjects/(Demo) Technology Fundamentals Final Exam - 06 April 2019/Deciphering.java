import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String encrypted = read.readLine();
        String[] letters = read.readLine().split("\\s+");

        Pattern valid = Pattern.compile("^([d-z{}#|]+)$");
        Matcher check = valid.matcher(encrypted);

        if (check.find()){
            String message = decrypter(encrypted);
            System.out.println(replaceLetters(letters, message));
        }else {
            System.out.println("This is not the book you are looking for.");
        }

    }

    private static String replaceLetters(String[] letters, String message) {
        int index = message.indexOf(letters[0]);

        while (index!=-1){

            message=message.replace(letters[0],letters[1]);

            index = message.indexOf(letters[0]);
        }
        return message;
    }

    private static String decrypter(String encrypted) {

        StringBuilder decrypt = new StringBuilder();

        for (int i = 0; i < encrypted.length(); i++) {
            int key = encrypted.charAt(i)-3;

            decrypt.append((char)key);

        }
        return decrypt.toString();
    }
}
