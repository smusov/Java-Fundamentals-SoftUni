import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class NascarQualifications {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> racers = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());

        String input;

        while (!"end".equals(input=read.readLine())){
            String[] data = input.split("\\s+");

            switch (data[0]){
                case "Race":
                    if (!racers.contains(data[1])){
                        racers.add(data[1]);
                    }
                    break;
                case"Accident":
                    racers.remove(data[1]);
                    break;
                case "Box":
                    if (racers.contains(data[1])){
                        int indexPosition = racers.indexOf(data[1]);
                        if (indexPosition!=racers.size()-1){
                            racers.remove(indexPosition);
                            racers.add(indexPosition+1,data[1]);
                        }
                    }
                    break;
                case "Overtake":
                    if (racers.contains(data[1])){

                        int indexOf = racers.indexOf(data[1]);
                        int addIndex = indexOf-Integer.parseInt(data[2]);

                        if (addIndex>=0&&addIndex<=racers.size()-1){
                            racers.remove(indexOf);
                            racers.add(addIndex,data[1]);
                        }
                    }
                    break;
            }
        }
        for (int i = 0; i < racers.size(); i++) {
            if (i==racers.size()-1){
                System.out.println(racers.get(i));
            }else {
                System.out.print(racers.get(i)+" ~ ");
            }
        }
    }
}