package OrderByAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String input;

        List<Person> persons = new ArrayList<>();

        while (!"End".equals(input= read.readLine())){
            String[] data = input.split("\\s+");
            Person person = new Person(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2]));
            persons.add(person);
        }
        persons.stream().sorted(Comparator.comparingInt(e -> e.age)).forEach(e-> System.out.println(e.toString()));
    }
}
