import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input;

        while (!"END".equals(input= read.readLine())){
            String[] com = input.split("\\s+");
            switch (com[0]){
                case "Change":
                    if (nums.contains(Integer.valueOf(com[1]))){
                        nums.set(nums.indexOf(Integer.parseInt(com[1])),Integer.parseInt(com[2]));
                    }
                    break;
                case "Hide":
                    nums.remove(Integer.valueOf(com[1]));
                    break;
                case "Switch":
                    if (nums.contains(Integer.valueOf(com[1]))&&nums.contains(Integer.valueOf(com[2]))){
                        Collections.swap(nums,nums.indexOf(Integer.valueOf(com[2])),nums.indexOf(Integer.valueOf(com[1])));
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(com[1])>=0&&Integer.parseInt(com[1])<nums.size()){
                        nums.add(Integer.parseInt(com[1])+1,Integer.valueOf(com[2]));
                    }
                    break;
                case "Reverse":
                    Collections.reverse(nums);
                    break;
            }
        }
        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}
