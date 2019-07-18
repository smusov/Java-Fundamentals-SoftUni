import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> racers = new LinkedHashMap<>();

        Arrays.stream(read.readLine().split(", ")).forEach(e->racers.put(e,0));
        
        String input;

        Pattern name = Pattern.compile("([A-Za-z]+)");
        Pattern distance = Pattern.compile("([\\d])");

        while(!"end of race".equals(input=read.readLine())){

            Matcher matchName = name.matcher(input);
            Matcher matchDistance = distance.matcher(input);

            StringBuilder inputName = new StringBuilder();

            while (matchName.find()){
                inputName.append(matchName.group());
            }

            int distanceInput = 0;

            while (matchDistance.find()){
                distanceInput+=Integer.parseInt(matchDistance.group());
            }
            if (racers.containsKey(inputName.toString())){
                racers.put(inputName.toString(),racers.get(inputName.toString())+distanceInput);
            }
        }

        AtomicInteger count = new AtomicInteger(1);

        racers.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue(),e1.getValue())).limit(3).forEach(e->{
            if (count.get() ==1){
                System.out.println(String.format("%sst place: %s",count.toString(),e.getKey()));
            }else if (count.get() ==2){
                System.out.println(String.format("%snd place: %s",count.toString(),e.getKey()));
            }else {
                System.out.println(String.format("%srd place: %s",count.toString(),e.getKey()));
            }
            count.getAndIncrement();
        });
    }
}
