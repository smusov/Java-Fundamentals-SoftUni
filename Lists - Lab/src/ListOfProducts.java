import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String readProducts = read.readLine();
            products.add(readProducts);
        }

        int count = 1;

        Collections.sort(products);

        for (String product : products) {

            String numeration = count + "." + product;
            System.out.println(numeration);
            count++;

        }

    }
}
