import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Concert {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        Map<String, Set<String>> bandAndMembers = new LinkedHashMap<>();
        Map<String,Integer> bandAndTime = new LinkedHashMap<>();

        String input;

        while(!"start of concert".equals(input=read.readLine())){

            String[] data = input.split("; +");

            switch (data[0]){
                case "Add":
                    bandAndMembers.putIfAbsent(data[1],new LinkedHashSet<>());
                    List<String> members = new ArrayList<>(Arrays.asList(data[2].split(", ")));
                    bandAndMembers.get(data[1]).addAll(members);

                    break;
                case "Play":
                    bandAndTime.putIfAbsent(data[1],0);
                    bandAndTime.put(data[1],bandAndTime.get(data[1])+Integer.parseInt(data[2]));
                    break;
            }

        }
        int totalTime = bandAndTime.values().stream().mapToInt(e->e).sum();
        System.out.println("Total time: "+totalTime);

        bandAndTime.entrySet().stream().sorted((e1,e2)->{
            int compare = Integer.compare(e2.getValue(),e1.getValue());

            if (compare==0){
                compare=e1.getKey().compareTo(e2.getKey());
            }
            return compare;
        }).forEach(e-> System.out.println(String.format("%s -> %d",e.getKey(),e.getValue())));

        String band = read.readLine();

        System.out.println(band);

        bandAndMembers.get(band).forEach(e-> System.out.println(String.format("=> %s",e)));
    }
}
