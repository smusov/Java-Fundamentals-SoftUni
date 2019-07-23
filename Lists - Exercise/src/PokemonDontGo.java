import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> removedElements = new ArrayList<>();

        while (!nums.isEmpty()) {
            int index = Integer.parseInt(read.readLine());
            if (index >= nums.size()) {

                index= indexValidator(index, nums);
                removeElementsAndAddSums(nums,removedElements,index);
                nums.add(nums.get(0));
            }else if (index < 0){

                index= indexValidator(index, nums);
                removeElementsAndAddSums(nums,removedElements,index);
                nums.add(0,nums.get(nums.size()-1));
            }
            else {
                removeElementsAndAddSums(nums,removedElements,index);
            }
        }
        System.out.println(removedElements.stream().mapToInt(e -> e).sum());
    }

    private static void removeElementsAndAddSums(List<Integer> nums, List<Integer> removedElements, int index) {

        int removedNum = nums.get(index);
        removedElements.add(nums.get(index));
        nums.remove(index);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)<=removedNum){
                nums.set(i,nums.get(i)+removedNum);
            }else if (nums.get(i)>=removedNum){
                nums.set(i,nums.get(i)-removedNum);
            }
        }

    }

    private static int indexValidator(int index, List<Integer> nums) {

        if (index < 0) {
            index=0;
        } else if (index >= nums.size()) {
            index=nums.size()-1;
        }
        return index;
    }
}
