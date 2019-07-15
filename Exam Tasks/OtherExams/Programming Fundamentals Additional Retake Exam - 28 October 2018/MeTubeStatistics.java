import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class MeTubeStatistics {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Map<String,Integer>viewsStatistics = new LinkedHashMap<>();
        Map<String,Integer>likeStatistics = new LinkedHashMap<>();

        while (!"stats time".equals(input=read.readLine())){
            String[] data = input.split("[-:]");

            switch (data[0]){
                case "like":
                    addLikes(data[1],likeStatistics);
                    break;
                case "dislike":
                    addDislikes(data[1],likeStatistics);
                    break;
                    default:
                        checkAndAddKeyOrValue(likeStatistics,viewsStatistics,data[0],data[1]);
                       break;
            }

        }
        if ("by likes".equals(read.readLine())){
            likeStatistics.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue(),e1.getValue())).
                    forEach(e-> System.out.println(e.getKey()+" - "+viewsStatistics.get(e.getKey())+ " views"+" - "+ e.getValue()+" likes"));
        }else {
            viewsStatistics.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue(),e1.getValue()))
                    .forEach(e-> System.out.println(e.getKey()+" - "+e.getValue()+" views"+" - "+likeStatistics.get(e.getKey())+" likes"));
        }
    }

    private static void addDislikes(String clip, Map<String, Integer> likeStatistics) {
        if (likeStatistics.containsKey(clip)){
            likeStatistics.put(clip,likeStatistics.get(clip)-1);
        }
    }

    private static void addLikes(String clip, Map<String, Integer> likeStatistics) {
        if (likeStatistics.containsKey(clip)){
            likeStatistics.put(clip,likeStatistics.get(clip)+1);
        }
    }

    private static void checkAndAddKeyOrValue(Map<String, Integer> nameAndLikes, Map<String, Integer> nameAndViews, String name, String views) {
        if (!nameAndViews.containsKey(name)){
            nameAndViews.put(name,Integer.parseInt(views));
            nameAndLikes.put(name,0);
        }else {
            int newViews = Integer.parseInt(views);
            nameAndViews.put(name,nameAndViews.get(name)+newViews);
        }
    }
}
