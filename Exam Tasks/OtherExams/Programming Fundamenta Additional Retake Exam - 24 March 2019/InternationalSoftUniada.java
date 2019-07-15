import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class InternationalSoftUniada {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Map<String,Map<String,Integer>>result = new LinkedHashMap<>();

        while (!"END".equals(input=read.readLine())){
            String[] racer = input.split("(\\s+[->]+\\s+|\\s[–>]+\\s)");
            if (!result.containsKey(racer[0])){ //Bulgaria
                result.put(racer[0],new LinkedHashMap<>());
                checkAndPutRacerAndPoint(result, racer);
            }else {
                checkAndPutRacerAndPoint(result, racer);
            }
        }
        Map<String,Integer> countryPoint = new LinkedHashMap<>();

        result.keySet().forEach(e-> countryPoint.put(e,0));

        result.forEach((key, value) -> {
            int res = value.values().stream().mapToInt(i -> i).sum();
            countryPoint.put(key, res);
        });

        Map<String, List<String>> countryPoint2 = new LinkedHashMap<>();

        countryPoint.entrySet().stream().sorted((e1,e2)-> Integer.compare(e2.getValue(),e1.getValue())).forEach(e->{

            String key = e.getKey()+": "+e.getValue();
            String otherKey = e.getKey();
            countryPoint2.put(key,new ArrayList<>());

            result.get(otherKey).entrySet().forEach(b->{
                String put = "-- "+b.getKey()+ " -> "+b.getValue();
                countryPoint2.get(key).add(put);
            });
        });

        countryPoint2.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
        });

    }

    private static void checkAndPutRacerAndPoint(Map<String, Map<String, Integer>> result, String[] racer) {
        if (!result.get(racer[0]).containsKey(racer[1])){ // Ivan Ivanov
            result.get(racer[0]).put(racer[1],Integer.parseInt(racer[2])); // 25
        }else {
            result.get(racer[0]).put(racer[1],result.get(racer[0]).get(racer[1])+Integer.parseInt(racer[2]));
        }
    }
}