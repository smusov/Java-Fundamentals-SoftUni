package Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = read.readLine().split("\\s+");
            Student student = new Student(data[0],data[1],Double.parseDouble(data[2]));
            students.add(student);
        }
        students.stream().sorted((e1,e2)->Double.compare(e2.getGrade(),e1.getGrade())).forEach(e-> System.out.println(e.toString()));
    }
}
