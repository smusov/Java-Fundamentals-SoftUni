import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SeizeTheFire {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] fires = read.readLine().split("[#]+");
        int water = Integer.parseInt(read.readLine());

        List<Integer>cells = new ArrayList<>();

        for (String element : fires) {

            String[] fire = element.split(" = ");
            int firePower = Integer.parseInt(fire[1]);

            switch (fire[0]){
                case "High":
                    if (firePower>=81&&firePower<=125&&water>=firePower){
                        water-=firePower;
                        cells.add(firePower);
                    }
                    break;
                case "Medium":
                    if (firePower>=51&&firePower<=80&&water>=firePower){
                        water-=firePower;
                        cells.add(firePower);
                    }
                    break;
                case "Low":
                    if (firePower>=1&&firePower<=50&&water>=firePower){
                        water-=firePower;
                        cells.add(firePower);
                    }
                    break;
            }
        }

        System.out.println("Cells:");
        cells.forEach(e-> System.out.println(String.format(" - %d",e)));
        System.out.println(String.format("Effort: %.2f",cells.stream().mapToDouble(e->e).sum()*0.25));
        System.out.println(String.format("Total Fire: %d",cells.stream().mapToInt(e->e).sum()));
    }
}
