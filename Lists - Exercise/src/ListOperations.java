import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!"End".equals(input = read.readLine())) {
            String[] com = input.split("\\s+");
            switch (com[0]) {
                case "Add":
                    int num = Integer.parseInt(com[1]);
                    nums.add(num);
                    break;
                case "Remove":
                    if (checkIndex(nums, com[1])) {
                        nums.remove(Integer.parseInt(com[1]));
                    }
                    break;
                case "Insert":
                    if (checkIndex(nums, com[2])) {
                        nums.add(Integer.parseInt(com[2]), Integer.parseInt(com[1]));
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(com[2]);
                    if (com[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            nums.add(nums.get(0));
                            nums.remove(0);
                        }
                    } else {

                        for (int j = 0; j < count; j++) {
                            nums.add(0, nums.get(nums.size() - 1));
                            nums.remove(nums.size() - 1);
                        }
                    }
                    break;
            }
        }
        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean checkIndex(List<Integer> nums, String index) {
        int i = Integer.parseInt(index);
        if (i >= 0 && i < nums.size()) {
            return true;
        } else {
            System.out.println("Invalid index");
            return false;
        }
    }
}