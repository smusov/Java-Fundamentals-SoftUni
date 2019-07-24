import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringManipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String string = "";

        String input;

        while (!"End".equals(input = read.readLine())) {

            String[] data = input.split("\\s+");

            switch (data[0]) {
                case "Add":
                    string += (data[1]);
                    break;
                case "Upgrade":

                    if (string.length() > 0) {

                        int oldChar = data[1].charAt(0) + 1;
                        string = string.replace(data[1],String.valueOf((char)oldChar));

                    }
                    break;
                case "Print":

                    System.out.println(string);

                    break;
                case "Index":
                    List<Integer> indexes = new ArrayList<>();

                    for (int i = 0; i < string.length(); i++) {

                        if (String.valueOf(string.charAt(i)).equals(data[1])){
                            indexes.add(i);
                        }

                    }

                    if (!indexes.isEmpty()){
                        System.out.println(indexes.toString().replaceAll("[\\[\\],]",""));
                    }else {
                        System.out.println("None");
                    }

                    break;
                case "Remove":

                    string = string.replace(data[1],"");

                    break;
            }

        }

    }
}
