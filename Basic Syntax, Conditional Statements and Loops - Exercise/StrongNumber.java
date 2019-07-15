import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();
        int parseNum = Integer.parseInt(input);

        int result = 0;

        for (int j = 0; j <input.length() ; j++) {

            int lastNum = parseNum%10;
            parseNum= parseNum/10;

            int fact=1;

            for(int i = 1; i<= lastNum; i++){
                fact=fact*i;
            }

            result+=fact;
        }
        if (result==Integer.parseInt(input)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}