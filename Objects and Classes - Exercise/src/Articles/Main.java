package Articles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split(", ");

        Article article = new Article(input[0],input[1],input[2]);

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {

            String[]com = read.readLine().split(": ");

            switch (com[0]){
                case "Edit":
                    article.setContent(com[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(com[1]);
                    break;
                case "Rename":
                    article.setTitle(com[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
