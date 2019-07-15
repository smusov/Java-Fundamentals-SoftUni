import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChatLogger {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        List<String> chat = new ArrayList<>();

        while (!"end".equals(input=read.readLine())){
            String[] com = input.split("\\s+");

            switch (com[0]){
                case "Chat":
                    chat.add(com[1]);
                    break;
                case "Delete":
                    int index = chat.indexOf(com[1]);
                    if (index!=-1){
                        chat.remove(index);
                    }
                    break;
                case "Edit":
                    int checkIndex = chat.indexOf(com[1]);
                    if (checkIndex!=-1){
                        chat.set(checkIndex,com[2]);
                    }
                    break;
                case "Pin":
                    int index2 = chat.indexOf(com[1]);
                    if (index2!=-1){
                        String word = chat.get(index2);
                        chat.remove(index2);
                        chat.add(word);
                    }
                    break;
                case "Spam":
                    chat.addAll(Arrays.asList(com).subList(1, com.length));
                    break;
            }
        }
        chat.forEach(System.out::println);
    }
}
