import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Pattern validArtist = Pattern.compile("^(([A-Z])([a-z' ]+))$");
        Pattern validSong = Pattern.compile("^([A-Z ]+)$");

        String input;

        while(!"end".equals(input=read.readLine())){
            
            String[]data = input.split(":");

            Matcher checkArtist = validArtist.matcher(data[0]);
            Matcher checkSong = validSong.matcher(data[1]);

            if (checkArtist.find()&&checkSong.find()){
                System.out.println("Successful encryption: "+encrypter(input, data[0]));
            }else {
                System.out.println("Invalid input!");
            }
            
        }
    
    }

    private static String encrypter(String input, String artist) {
        StringBuilder result = new StringBuilder();

        //capitalLetters >=65 && <=90
        //letters >=97&&<=122

        for (int i = 0; i < input.length(); i++) {

            int sum = artist.length() + input.charAt(i);

            if (Character.isUpperCase(input.charAt(i))){
               if (sum>=65&&sum<=90){
                   result.append((char)sum);
               }else {
                   sum=sum-90+64;
                   result.append((char)sum);
               }
            }else if (Character.isLowerCase(input.charAt(i))){
                if (sum>=97&&sum<=122){
                    result.append((char)sum);
                }else {
                   sum=sum-122+96;
                   result.append((char)sum);
                }
            }else if (input.charAt(i)==' '||input.charAt(i)=='\''){
                result.append(input.charAt(i));
            }else if (input.charAt(i)==':'){
                result.append("@");
            }
        }
        return result.toString();
    }
}
