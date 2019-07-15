import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("&+");

        Pattern pattern = Pattern.compile("(^[A-Za-z\\d]+$)");
        List<String> result = new ArrayList<>();

        for (String element : input) {

            Matcher matcher = pattern.matcher(element);

            if (matcher.find()) {
                if (element.length() == 16 || element.length() == 25) {
                    String[] groups = divideGroups(element.toUpperCase());
                    generateSerialNumber(result,groups);
                }
            }

        }
        System.out.println(result.toString().replaceAll("[\\[\\]]",""));
    }

    private static void generateSerialNumber(List<String> result, String[] groups) {

        StringBuilder serial = new StringBuilder();

        for (int i = 0 ; i < groups.length; i++) {

            for (int j = 0; j < groups[i].length(); j++) {
                if (Character.isDigit(groups[i].charAt(j))){
                    int num = Character.getNumericValue(groups[i].charAt(j));
                    serial.append(9-num);
                }else {
                    serial.append(groups[i].charAt(j));
                }
            }

            if (i!=groups.length-1){
                serial.append("-");
            }
        }

        result.add(serial.toString());
    }

    private static String[] divideGroups(String element) {
        String[] groups;

        int length = 0;
        int i = 0;

        if (element.length()==16){
            groups=new String[4];

            while (length<element.length()){
                groups[i++]=element.substring(length,length+4);
                length+=4;
            }

        }else {
            groups=new String[5];

            while (length<element.length()){
                groups[i++]=element.substring(length,length+5);
                length+=5;
            }

        }

        return groups;
    }
}
