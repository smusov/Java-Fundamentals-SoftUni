import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command;

        while (!"end".equals(command = read.readLine())) {

            String[] type = command.split(" ");

            switch (type[0]) {
                case "Add":
                    addNums(type, nums);
                    break;
                case "Remove":
                    removeNums(type, nums);
                    break;
                case "RemoveAt":
                    removeAt(type,nums);
                    break;
                case "Insert":
                    addAtIndex(type,nums);
                    break;
            }
        }
        System.out.println(nums.toString().replaceAll("[\\[\\],]",""));
    }

    private static void addNums(String[] command, List<Integer> nums) {
        int num = Integer.parseInt(command[1]);
        nums.add(nums.size(), num);
    }

    private static void removeNums(String[] command, List<Integer> nums) {
        int num = Integer.parseInt(command[1]);
        for (int i = 0; i < nums.size(); i++) {
            if (num==nums.get(i)){
                nums.remove(i);
                break;
            }
        }
    }

    private static void removeAt(String[] command, List<Integer> nums) {
        int num = Integer.parseInt(command[1]);
        nums.remove(num);
    }
    private static void addAtIndex(String[] command, List<Integer> nums){
        int firstNum = Integer.parseInt(command[1]);
        int secondNum = Integer.parseInt(command[2]);
        nums.add(secondNum,firstNum);

    }
}
