import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int[] bomb = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while (findIndex(nums,bomb)!=-1){

            int bombNumIndex = findIndex(nums,bomb);

            int startIndex = validateIndex(bombNumIndex-bomb[1],nums);
            int endIndex = validateIndex(bombNumIndex+bomb[1],nums);

            for (int i = startIndex; i <=endIndex ; i++) {
                nums.set(i,0);
            }
        }

        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
    }

    private static int findIndex (List<Integer> nums, int[] bomb){
        int bombNumIndex = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)==bomb[0]){
                bombNumIndex = i;
                break;
            }
        }
        return bombNumIndex;
    }

    private static int validateIndex(int index, List<Integer>nums) {

        if (index<0){
            index=0;
        }
        if (index>nums.size()-1){
            index=nums.size()-1;
        }
        return index;
    }
}
