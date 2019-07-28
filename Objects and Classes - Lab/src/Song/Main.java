package Song;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(read.readLine());

        List<Songs> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String[] data = read.readLine().split("_+");
            Songs songs = new Songs(data[0],data[1],data[2]);

            result.add(songs);
        }
        String typeList = read.readLine();

        for (Songs songs : result) {
            if (songs.getTypeList().equals(typeList)) {
                System.out.println(songs.getName());
            }
            if (typeList.equals("all")){
                System.out.println(songs.getName());
            }
        }

    }
}
