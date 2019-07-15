import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasterGifts {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> data = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());

        String input;

        while (!"No Money".equals(input=read.readLine())){
            String[] com = input.split("\\s+");

            switch (com[0]){
                case "OutOfStock":
                    for (int i = 0; i < data.size(); i++) {
                        if (data.get(i).equals(com[1])){
                            data.set(i,"None");
                        }
                    }
                    break;
                case "Required":
                    if (Integer.parseInt(com[2])>=0&&Integer.parseInt(com[2])<data.size()){
                        data.set(Integer.parseInt(com[2]),com[1]);
                    }
                    break;
                case "JustInCase":
                    data.set(data.size()-1,com[1]);
                    break;
            }
        }
        data.stream().filter(e->!e.equals("None")).forEach(e-> System.out.print(e+" "));
    }
}
