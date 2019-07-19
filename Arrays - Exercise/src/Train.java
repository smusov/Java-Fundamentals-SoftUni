import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Train {
    public static void main(String[] args) throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        int[] people = new int[n];

        for (int i = 0; i < people.length; i++) {
            int input = Integer.parseInt(read.readLine());
            people[i]=input;
        }

        for (int person : people) {
            System.out.print(person+" ");
        }
        System.out.println();
        System.out.println(Arrays.stream(people).sum());
    }
}
