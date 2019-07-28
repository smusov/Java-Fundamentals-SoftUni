package Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        List<Students> result = new ArrayList<>();

        while (!"end".equals(input=read.readLine())){
            String[] data = input.split("\\s+");
            Students students = new Students(data[0],data[1],Integer.parseInt(data[2]),data[3]);
            result.add(students);
        }
        String town = read.readLine();

        for (int a = 0; a < result.size(); a++) {
            if (result.get(a).getTown().equals(town)){

                for (int i = 0; i < result.size(); i++) {
                    for (int j = 0; j < i; j++) {

                        String first = result.get(i).getFirstName()+" "+result.get(i).getLastName();
                        String second = result.get(j).getFirstName()+" "+result.get(j).getLastName();
                        if (first.equals(second)){

                            int oneAge = result.get(i).getAge();
                            int secondAge = result.get(j).getAge();

                            if (oneAge>=secondAge){
                                result.remove(j);
                                break;
                            }else {
                                result.remove(i);
                                break;
                            }
                        }
                    }
                }
            }
        }
        result.stream().filter(e->e.getTown().equals(town)).forEach(e-> System.out.printf("%s %s is %d years old\n",e.getFirstName(),e.getLastName(),e.getAge()));
    }
}
