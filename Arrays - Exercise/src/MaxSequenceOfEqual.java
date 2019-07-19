import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequenceOfEqual {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int [] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //2 1 1 2 3 3 2 2 2 1

        int startIndex = 0;
        int endIndex = 0;
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            int nowCount = 0;

            for (int j = i; j <input.length ; j++) {

                if (input[i]==input[j]){

                    nowCount++;

                    if (nowCount>count){

                        count=nowCount;
                        startIndex=i;
                        endIndex=j;
                    }
                }else {
                    break;
                }
            }
        }

        for (int i = startIndex; i <=endIndex ; i++) {
            System.out.print(input[i]+" ");
        }

    }
}
