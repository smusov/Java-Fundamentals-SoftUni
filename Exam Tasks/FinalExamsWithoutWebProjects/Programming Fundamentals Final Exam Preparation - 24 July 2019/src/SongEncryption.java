import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^(?<all>(?<artist>[A-Z]([a-z ']+)):(?<song>[A-Z ]+))$");

        String input;

        while(!"end".equals(input=read.readLine())){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                System.out.println("Successful encryption: "+encryptedElement(matcher.group("artist").length(), matcher.group("all")));
            }else {
                System.out.println("Invalid input!");
            }


        }

    }

    private static String encryptedElement(int key, String all) {
        //Capital Letters => 65-90
        //Lower Letters   => 97-122

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < all.length(); i++) {

            int newChar = all.charAt(i)+key; // 95

            if (Character.isUpperCase(all.charAt(i))){

                if (newChar>=65&&newChar<=90){
                    result.append((char)newChar);
                }else {
                    newChar=newChar%90+65-1;
                    result.append((char)newChar);
                }

            }else if (Character.isLowerCase(all.charAt(i))){

                if (newChar>=97&&newChar<=122){
                    result.append((char)newChar);
                }else {
                    newChar=newChar%122+97-1;
                    result.append((char)newChar);
                }

            }else if (all.charAt(i)==':'){
                result.append("@");
            }else if (all.charAt(i)==' '){
                result.append(" ");
            }else if (all.charAt(i)=='\''){
                result.append("'");
            }
        }
        return result.toString();
    }
}
