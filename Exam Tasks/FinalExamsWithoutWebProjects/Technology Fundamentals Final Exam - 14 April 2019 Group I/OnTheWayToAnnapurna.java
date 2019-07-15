import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OnTheWayToAnnapurna {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> shops = new LinkedHashMap<>();
        
        String input;
        
        while(!"END".equals(input=read.readLine())){
            String[]com = input.split("->");
            switch (com[0]){
                case "Add":
                    if (com[2].contains(",")) {
                        shops.putIfAbsent(com[1],new ArrayList<>());
                        shops.get(com[1]).addAll(Arrays.asList(com[2].split(",")));
                    }else {
                        shops.putIfAbsent(com[1],new ArrayList<>());
                        shops.get(com[1]).add(com[2]);
                    }
                    break;
                case "Remove":
                    shops.remove(com[1]);
                    break;
            }
        }

        System.out.println("Stores list:");

        shops.entrySet().stream().sorted((e1,e2)->{
            int compare = Integer.compare(e2.getValue().size(),e1.getValue().size());

            if (compare==0){
                compare=e2.getKey().compareTo(e1.getKey());
            }
            return compare;
        }).forEach(e->{
            System.out.println(e.getKey());
            e.getValue().forEach(b-> System.out.println(String.format("<<%s>>",b)));
        });
    }
}
