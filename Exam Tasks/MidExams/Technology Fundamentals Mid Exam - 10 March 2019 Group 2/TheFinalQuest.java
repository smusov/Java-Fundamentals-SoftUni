import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> data = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());

        String input;

        while (!"Stop".equals(input=read.readLine())){
            String[] com = input.split("\\s+");

            switch (com[0]){
                case "Delete":
                    if (Integer.parseInt(com[1])+1>=0&&Integer.parseInt(com[1])+1<data.size()){
                        data.remove((Integer.parseInt(com[1])+1));
                    }
                    break;
                case "Swap":
                    if (data.contains(com[1])&&data.contains(com[2])){
                        Collections.swap(data,data.indexOf(com[2]),data.indexOf(com[1]));
                    }
                    break;
                case "Put":
                    int index = Integer.parseInt(com[2])-1;

                    if (index>=0&&index<=data.size()){
                        data.add(index,com[1]);
                    }
                    break;
                case "Sort":
                    data = data.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                    break;
                case "Replace":
                    if (data.contains(com[2])){
                        data.set(data.indexOf(com[2]),com[1]);
                    }
                    break;
            }

        }
        System.out.println(data.toString().replaceAll("[\\[\\],]",""));
    }
}
