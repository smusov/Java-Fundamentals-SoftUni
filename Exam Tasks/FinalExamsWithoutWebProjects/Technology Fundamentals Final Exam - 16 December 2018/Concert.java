import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Concert {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String input;

        Map<String, List<String>> bandAndMembers = new LinkedHashMap<>();
        Map<String, Integer> bandAndTime = new LinkedHashMap<>();

        while(!"start of concert".equals(input=read.readLine())){
            
            String[] data = input.split("; ");

            switch (data[0]){
                case "Add":
                    bandAndMembers.putIfAbsent(data[1],new ArrayList<>());
                    addMembers(bandAndMembers,data[2],data[1]);
                    break;
                case "Play":
                    bandAndTime.putIfAbsent(data[1],0);
                    bandAndTime.put(data[1],bandAndTime.get(data[1])+Integer.parseInt(data[2]));
                    break;
            }

        }

        int time = bandAndTime.values().stream().mapToInt(e->e).sum();
        System.out.println("Total time: "+time);

        bandAndTime.entrySet().stream().sorted((e1,e2)->{
            int compare = Integer.compare(e2.getValue(),e1.getValue());
            if (compare==0){

                compare=e1.getKey().compareTo(e2.getKey());
            }
            return compare;
        })
                .forEach(e-> System.out.println(String.format("%s -> %d",e.getKey(),e.getValue())));

        String band = read.readLine();
        System.out.println(band);

        bandAndMembers.get(band).forEach(e-> System.out.println("=> "+e));
    }

    private static void addMembers(Map<String, List<String>> bandAndMembers, String members, String band) {
        String[] mem = members.split(", ");
        for (String member : mem) {
            if (!bandAndMembers.get(band).contains(member)){
                bandAndMembers.get(band).add(member);
            }
        }
    }
}
