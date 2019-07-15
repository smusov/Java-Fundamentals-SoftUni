import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PresentDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer>houses = Arrays.stream(read.readLine().split("[@]+")).map(Integer::parseInt).collect(Collectors.toList());

        String input;

        int santaIndex = 0;

        while (!"Merry Xmas!".equals(input=read.readLine())){

            int jumpIndex = Integer.parseInt(input.substring(input.lastIndexOf(" ")+1));


            if (santaIndex+jumpIndex>houses.size()-1){
                santaIndex=0;
                houses.set(santaIndex,houses.get(santaIndex)-2);
                continue;
            }else {
                santaIndex+=jumpIndex;
            }

            if (houses.get(santaIndex)!=0){
                houses.set(santaIndex,houses.get(santaIndex)-2);
            }else {
                System.out.println(String.format("House %d will have a Merry Christmas.",santaIndex));
            }

        }

    }

    private static int validateSantaIndex(int santaIndex, int size, int jumpIndex) {
        if (jumpIndex+santaIndex>size-1){
            santaIndex=0;
        }else {
            santaIndex+=jumpIndex;
        }
        return santaIndex;
    }
}
