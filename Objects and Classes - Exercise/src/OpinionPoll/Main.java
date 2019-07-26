package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = read.readLine().split("\\s+");
            Person person = new Person(input[0],Integer.parseInt(input[1]));
            people.add(person);
        }
        people=people.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        people.forEach(e-> System.out.println(e.toString()));
    }
}
