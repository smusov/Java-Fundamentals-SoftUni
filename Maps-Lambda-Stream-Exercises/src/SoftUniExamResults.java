import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftUniExamResults {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> submissionsAndCount = new LinkedHashMap<>();
        Map<String,Integer> nameAndPoints = new LinkedHashMap<>();
        
        String input;
        
        while(!"exam finished".equals(input=read.readLine())){
            
            String[] data = input.split("[\\-]+");

            if (data[1].equals("banned")){

                nameAndPoints.remove(data[0]);

            }else {
                if (!nameAndPoints.containsKey(data[0])){

                    nameAndPoints.putIfAbsent(data[0],Integer.parseInt(data[2]));

                    submissionsAndCount.putIfAbsent(data[1],0);
                    submissionsAndCount.put(data[1],submissionsAndCount.get(data[1])+1);

                }else {

                    if (nameAndPoints.get(data[0])<Integer.parseInt(data[2])){
                        nameAndPoints.replace(data[0],Integer.parseInt(data[2]));
                    }
                    submissionsAndCount.put(data[1],submissionsAndCount.get(data[1])+1);
                }
            }
        }
        System.out.println("Results:");
        nameAndPoints.entrySet().stream().sorted((e1,e2)->{
            int a = Integer.compare(e2.getValue(),e1.getValue());
            if (a==0){
                a=e1.getKey().compareTo(e2.getKey());
            }
            return a;
        }).forEach(e-> System.out.println(String.format("%s | %s",e.getKey(),e.getValue())));

        System.out.println("Submissions:");
        submissionsAndCount.entrySet().stream().sorted((e1,e2)->{
            int a = Integer.compare(e2.getValue(),e1.getValue());
            if (a==0){
                a=e1.getKey().compareTo(e2.getKey());
            }
            return a;
        }).forEach(e-> System.out.println(String.format("%s - %s",e.getKey(),e.getValue())));
    }
}
