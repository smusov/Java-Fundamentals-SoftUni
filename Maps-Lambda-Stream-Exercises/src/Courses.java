import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Courses {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> courses = new LinkedHashMap<>();
        
        String input;
        
        while(!"end".equals(input=read.readLine())){

            String[] data = input.split(" : ");
            
            courses.putIfAbsent(data[0],new ArrayList<>());
            courses.get(data[0]).add(data[1]);
            
        }
        courses.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size())).forEach(e->{
            System.out.println(String.format("%s: %d",e.getKey(),e.getValue().size()));
            Collections.sort(e.getValue());
            e.getValue().forEach(a-> System.out.println("-- "+a));
        });
    }
}
