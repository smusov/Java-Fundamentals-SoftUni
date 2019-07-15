import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args)throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        System.out.println(lastDigit(n));
    }

    private static String lastDigit(int n) {
        int num = n%10;
        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"one");
        integerStringMap.put(2,"two");
        integerStringMap.put(3,"three");
        integerStringMap.put(4,"four");
        integerStringMap.put(5,"five");
        integerStringMap.put(6,"six");
        integerStringMap.put(7,"seven");
        integerStringMap.put(8,"eight");
        integerStringMap.put(9,"nine");
        integerStringMap.put(0,"zero");
        return integerStringMap.get(num);
    }
}