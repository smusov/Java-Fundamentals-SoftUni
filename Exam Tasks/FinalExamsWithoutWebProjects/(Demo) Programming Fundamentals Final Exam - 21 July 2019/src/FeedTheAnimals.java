import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FeedTheAnimals {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Set<String>> areaAndName = new LinkedHashMap<>();
        Map<String,Integer> nameAndFoodLimit = new LinkedHashMap<>();
        
        String input;
        
        while(!"Last Info".equals(input=read.readLine())){
        
            String[] data = input.split(":+");

            switch (data[0]){
                case "Add":
                    areaAndName.putIfAbsent(data[3],new LinkedHashSet<>());
                    areaAndName.get(data[3]).add(data[1]);

                    nameAndFoodLimit.putIfAbsent(data[1],0);
                    nameAndFoodLimit.put(data[1],nameAndFoodLimit.get(data[1])+Integer.parseInt(data[2]));

                    break;
                case "Feed":

                    if (nameAndFoodLimit.containsKey(data[1])){

                        nameAndFoodLimit.put(data[1],nameAndFoodLimit.get(data[1])-Integer.parseInt(data[2]));
                        if (nameAndFoodLimit.get(data[1])<=0){
                            System.out.println(data[1]+" was successfully fed");

                            nameAndFoodLimit.remove(data[1]);
                            areaAndName.get(data[3]).remove(data[1]);
                        }
                    }
                    break;
            }
        }

        System.out.println("Animals:");

        nameAndFoodLimit.entrySet().stream().sorted((e1,e2)->{
            int compare = Integer.compare(e2.getValue(),e1.getValue());

            if (compare==0){
                compare=e1.getKey().compareTo(e2.getKey());
            }
            return compare;
        }).forEach(e-> System.out.println(String.format("%s -> %dg",e.getKey(),e.getValue())));

        System.out.println("Areas with hungry animals:");

        areaAndName.entrySet().stream().filter(e->e.getValue().size()>0)
                .sorted((e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(e-> System.out.println(String.format("%s : %d",e.getKey(),e.getValue().size())));

    }
}
