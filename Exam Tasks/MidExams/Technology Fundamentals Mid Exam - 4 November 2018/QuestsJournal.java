import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String>quest = Arrays.stream(read.readLine().split(", ")).collect(Collectors.toList());

        String input;

        while (!"Retire!".equals(input=read.readLine())){
            String [] data  = input.split(" - ");
            switch (data[0]){
                case "Start":
                    if (!quest.contains(data[1])){
                        quest.add(data[1]);
                    }
                    break;
                case "Complete":
                    quest.remove(data[1]);
                    break;
                case "Side Quest":
                    String first = data[1].substring(0,data[1].indexOf(":"));
                    String second = data[1].substring(data[1].indexOf(":")+1);
                    if (quest.contains(first)){

                        if (!quest.contains(second)){
                            quest.add(quest.indexOf(first)+1,second);
                        }
                    }
                    break;
                case "Renew":
                    if (quest.contains(data[1])){
                        quest.remove(data[1]);
                        quest.add(data[1]);
                    }
                    break;
            }
        }
        System.out.println(quest.toString().replaceAll("[\\[\\]]",""));
    }
}
