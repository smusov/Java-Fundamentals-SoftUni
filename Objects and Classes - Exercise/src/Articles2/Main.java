package Articles2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = read.readLine().split(", ");
            Article article = new Article(data[0],data[1],data[2]);
            articles.add(article);
        }
        switch (read.readLine()){
            case "title":
                articles.stream().sorted(Comparator.comparing(Article::getTitle)).forEach(e-> System.out.println(e.toString()));
                break;
            case "content":
                articles.stream().sorted(Comparator.comparing(Article::getContent)).forEach(e-> System.out.println(e.toString()));
                break;
            case "author":
                articles.stream().sorted(Comparator.comparing(Article::getAuthor)).forEach(e-> System.out.println(e.toString()));
                break;
        }
    }
}
