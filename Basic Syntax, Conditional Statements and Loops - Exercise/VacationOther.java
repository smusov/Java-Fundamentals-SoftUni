import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class VacationOther {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(read.readLine());
        String firstKey = read.readLine();
        String secondKey = read.readLine();

        Map<String, Map<String, Double>> data = new LinkedHashMap<>();

        data.put("Students", new LinkedHashMap<>());
        data.get("Students").put("Friday",8.45);
        data.get("Students").put("Saturday",9.80);
        data.get("Students").put("Sunday",10.46);

        data.put("Business", new LinkedHashMap<>());
        data.get("Business").put("Friday",10.90);
        data.get("Business").put("Saturday",15.60);
        data.get("Business").put("Sunday",16.00);

        data.put("Regular", new LinkedHashMap<>());
        data.get("Regular").put("Friday",15.00);
        data.get("Regular").put("Saturday",20.00);
        data.get("Regular").put("Sunday",22.50);

        double result = num*data.get(firstKey).get(secondKey);

        if (firstKey.equals("Students")&&num>=30){
            result*=0.85;
        }else if (firstKey.equals("Business")&&num>=100){
            result-=data.get(firstKey).get(secondKey)*10;
        }else if (firstKey.equals("Regular")&&num>=10&&num<=20){
            result*=0.95;
        }
        System.out.printf("Total price: %.2f",result);
    }
}