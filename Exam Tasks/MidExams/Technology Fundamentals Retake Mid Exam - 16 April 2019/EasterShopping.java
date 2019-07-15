import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EasterShopping {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> shops = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            String[] com = read.readLine().split("\\s+");

            switch (com[0]){
                case "Include":
                    shops.add(com[1]);
                    break;
                case "Visit":
                    if (com[1].equals("first")){
                        removeFirstShops(shops,Integer.parseInt(com[2]));
                    }else {
                        removeLastShops(shops,Integer.parseInt(com[2]));
                    }
                    break;
                case "Prefer":
                    int firstIndex = Integer.parseInt(com[1]);
                    int secondIndex = Integer.parseInt(com[2]);
                    if (firstIndex>=0&&firstIndex<shops.size()&&secondIndex>=0&&secondIndex<shops.size()){
                        Collections.swap(shops,secondIndex,firstIndex);
                    }
                    break;
                case "Place":
                    if (Integer.parseInt(com[2])+1>=0&&Integer.parseInt(com[2])+1<shops.size()){
                        shops.add(Integer.parseInt(com[2])+1,com[1]);
                    }
                    break;
            }
        }
        System.out.println("Shops left:");
        System.out.println(shops.toString().replaceAll("[\\[\\],]",""));
    }

    private static void removeLastShops(List<String> shops, int count) {
        if (count<=shops.size()){
            for (int i = 0; i < count; i++) {
                shops.remove(shops.size()-1);
            }
        }

    }

    private static void removeFirstShops(List<String> shops, int count) {
        if (count<=shops.size()){
            if (count > 0) {
                shops.subList(0, count).clear();
            }
        }

    }
}
